package com.example.bagasgr.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bagasgr.myapplication.model.DataItem;
import com.example.bagasgr.myapplication.model.LoginParameter;
import com.example.bagasgr.myapplication.model.ResponseLogin;
import com.example.bagasgr.myapplication.model.dashboardModel.DashboardDataItem;
import com.example.bagasgr.myapplication.model.dashboardModel.DashboardResponse;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {
    public static final String BASE_URL = "http://54.206.115.140:6969/api/";
    Button loginButton;
    Retrofit retrofit;
    TextView email,password;
    LoginParameter loginInformation = new LoginParameter("marsha@freehub.com", "ZXasqw12","1");


    private View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"test",Toast.LENGTH_SHORT).show();
            login();

        }
    };
    private ApiEndPointInterface apiService;
    private SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = findViewById(R.id.button_login);
        loginButton.setOnClickListener(clickListener);

        buildRetrofit();

        apiService = retrofit.create(ApiEndPointInterface.class);
        prefs = this.getSharedPreferences(
                "com.example.app", Context.MODE_PRIVATE);
    }

    public void buildRetrofit(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

         retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                 .client(client)
                .build();
    }

    public void login(){
        email = (TextView) findViewById(R.id.email);
        password = (TextView) findViewById(R.id.password);

        loginInformation.setNemail(email.getText().toString());
        loginInformation.setNpassword(password.getText().toString());

        Call<ResponseLogin> call = apiService.login(loginInformation);
        call.enqueue(new Callback<ResponseLogin>() {
            @Override
            public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                int statusCode = response.code();
                ResponseLogin userInformation = response.body();
                if(statusCode == 200)
                {
                    List<DataItem> data = userInformation.getData();
                    int userId = data.get(0).getUserId();
                    int businessId = data.get(0).getBusinessId();
                    prefs.edit().putInt("userId", userId);
                    prefs.edit().putInt("businessId", businessId);
                    prefs.edit().apply();

                    getDashboardData(userId,businessId);

                    Log.d("bagas", "onResponse: "+prefs.getInt("userId", 0));

                    Intent i = new Intent(LoginActivity.this, BottomNavigationActivity.class);
                    startActivity(i);
                }

            }

            @Override
            public void onFailure(Call<ResponseLogin> call, Throwable t) {
                // Log error here since request failed
                Toast.makeText(getApplicationContext(),"Failed to login",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getDashboardData(int userId, int businessId) {
        Call<DashboardResponse> dashboardCall = apiService.getDashboard(businessId, userId, 1);
        dashboardCall.enqueue(new Callback<DashboardResponse>() {
            @Override
            public void onResponse(Call<DashboardResponse> call, Response<DashboardResponse> response) {
                int statusCode = response.code();
                DashboardResponse userInformation = response.body();
                if (statusCode == 200) {
                    List<DashboardDataItem> data = userInformation.getData();
                    int connectedBusinessCount = data.get(0).getConnectedBusinessCount();
                    int pendingInvitationCount = data.get(0).getPendingInvitationCount();
                    int connectRequestCount = data.get(0).getConnectRequestCount();
                    int teamMemberCount = data.get(0).getTeamMemberCount();

                }

            }

            @Override
            public void onFailure(Call<DashboardResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"failed to retrieve dashboard data",Toast.LENGTH_SHORT).show();
            }
        });
    }

}

