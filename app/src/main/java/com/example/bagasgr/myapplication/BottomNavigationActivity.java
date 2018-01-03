package com.example.bagasgr.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bagasgr.myapplication.model.SharedPreferenceClass;
import com.example.bagasgr.myapplication.model.dashboardModel.DashboardDataItem;
import com.example.bagasgr.myapplication.model.dashboardModel.DashboardResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class BottomNavigationActivity extends AppCompatActivity {

    private TextView mTextMessage;
    public static final String BASE_URL = "http://54.206.115.140:6969/api/";
    private ApiEndPointInterface apiService;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_dashboard1:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_dashboard2:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_dashboard3:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_dashboard4:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_dashboard5:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LoginActivity loginActivity = new LoginActivity();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Retrofit retrofit = loginActivity.buildRetrofit();
        apiService = retrofit.create(ApiEndPointInterface.class);
        getDashboardData(SharedPreferenceClass.getValue("userId", getApplicationContext()), SharedPreferenceClass.getValue("businessId", getApplicationContext()) );
    }
    public void getDashboardData(String userId, String businessId) {
        Call<DashboardResponse> dashboardCall = apiService.getDashboard(Integer.parseInt(businessId), Integer.parseInt(userId), 1);
        dashboardCall.enqueue(new Callback<DashboardResponse>() {
            @Override
            public void onResponse(Call<DashboardResponse> call, Response<DashboardResponse> response) {
                int statusCode = response.code();
                DashboardResponse userInformation = response.body();
                if (statusCode == 200) {
                    TextView connectedBusiness = (TextView) findViewById(R.id.connectedBusiness);
                    TextView  pendingInvitation = (TextView) findViewById(R.id.pendingInvitation);
                    TextView connectRequest = (TextView) findViewById(R.id.connectRequest);
                    TextView teamMember = (TextView) findViewById(R.id.Team_Member);
                    List<DashboardDataItem> data = userInformation.getData();
                    int connectedBusinessCount = data.get(0).getConnectedBusinessCount();
                    int pendingInvitationCount = data.get(0).getPendingInvitationCount();
                    int connectRequestCount = data.get(0).getConnectRequestCount();
                    int teamMemberCount = data.get(0).getTeamMemberCount();

                    connectedBusiness.setText(Integer.toString(connectedBusinessCount), TextView.BufferType.NORMAL);
                    pendingInvitation.setText(Integer.toString(pendingInvitationCount), TextView.BufferType.NORMAL);
                    connectRequest.setText(Integer.toString(connectRequestCount), TextView.BufferType.NORMAL);
                    teamMember.setText(Integer.toString(teamMemberCount), TextView.BufferType.NORMAL);
                }

            }

            @Override
            public void onFailure(Call<DashboardResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"failed to retrieve dashboard data",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
