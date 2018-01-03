package com.example.bagasgr.myapplication;

import com.example.bagasgr.myapplication.model.LoginParameter;
import com.example.bagasgr.myapplication.model.ResponseLogin;
import com.example.bagasgr.myapplication.model.dashboardModel.DashboardResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by bagasgr on 12/29/2017.
 */

public interface ApiEndPointInterface {
    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter


    @POST("v1/Account/Login")
    Call<ResponseLogin> login(@Body LoginParameter loginParameter);

    @GET("v1/Dashboard/{businessId}/{systemUserId}/{lastUpdate}")
    Call<DashboardResponse> getDashboard(@Path("businessId") int businessId, @Path("systemUserId") int systemUserId, @Path("lastUpdate") long lastUpdate);
}
