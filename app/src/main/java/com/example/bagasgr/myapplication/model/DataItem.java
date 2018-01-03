package com.example.bagasgr.myapplication.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DataItem{

	@SerializedName("subscribedApps")
	private List<SubscribedAppsItem> subscribedApps;

	@SerializedName("businessId")
	private int businessId;

	@SerializedName("businessName")
	private String businessName;

	@SerializedName("fullName")
	private String fullName;

	@SerializedName("photo")
	private String photo;

	@SerializedName("logo")
	private String logo;

	@SerializedName("userType")
	private int userType;

	@SerializedName("userId")
	private int userId;

	public void setSubscribedApps(List<SubscribedAppsItem> subscribedApps){
		this.subscribedApps = subscribedApps;
	}

	public List<SubscribedAppsItem> getSubscribedApps(){
		return subscribedApps;
	}

	public void setBusinessId(int businessId){
		this.businessId = businessId;
	}

	public int getBusinessId(){
		return businessId;
	}

	public void setBusinessName(String businessName){
		this.businessName = businessName;
	}

	public String getBusinessName(){
		return businessName;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}

	public void setLogo(String logo){
		this.logo = logo;
	}

	public String getLogo(){
		return logo;
	}

	public void setUserType(int userType){
		this.userType = userType;
	}

	public int getUserType(){
		return userType;
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
			"DashboardDataItem{" +
			"subscribedApps = '" + subscribedApps + '\'' + 
			",businessId = '" + businessId + '\'' + 
			",businessName = '" + businessName + '\'' + 
			",fullName = '" + fullName + '\'' + 
			",photo = '" + photo + '\'' + 
			",logo = '" + logo + '\'' + 
			",userType = '" + userType + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}
}