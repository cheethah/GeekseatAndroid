package com.example.bagasgr.myapplication.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bagasgr on 12/29/2017.
 */

public class LoginParameter {
    @SerializedName("email")
    private
    String nemail;

    @SerializedName("password")
    private
    String npassword;

    @SerializedName("deviceToken")
    String ndeviceToken;


    public LoginParameter(String email, String password, String ndeviceToken) {
        this.setNemail(email);
        this.setNpassword(password);
        this.ndeviceToken = ndeviceToken;
    }

    public String getNemail() {
        return nemail;
    }

    public void setNemail(String nemail) {
        this.nemail = nemail;
    }

    public String getNpassword() {
        return npassword;
    }

    public void setNpassword(String npassword) {
        this.npassword = npassword;
    }
}
