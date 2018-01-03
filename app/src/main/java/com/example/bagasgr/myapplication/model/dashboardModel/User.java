package com.example.bagasgr.myapplication.model.dashboardModel;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class User{

	@SerializedName("profileLastUpdate")
	private int profileLastUpdate;

	@SerializedName("userId")
	private int userId;

	public void setProfileLastUpdate(int profileLastUpdate){
		this.profileLastUpdate = profileLastUpdate;
	}

	public int getProfileLastUpdate(){
		return profileLastUpdate;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"profileLastUpdate = '" + profileLastUpdate + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}
}