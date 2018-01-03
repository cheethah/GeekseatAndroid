package com.example.bagasgr.myapplication.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SubscribedAppsItem{

	@SerializedName("isSubscribed")
	private boolean isSubscribed;

	@SerializedName("entityType")
	private String entityType;

	@SerializedName("isCreateAllowed")
	private boolean isCreateAllowed;

	@SerializedName("isUpdateAllowed")
	private boolean isUpdateAllowed;

	@SerializedName("isReadAllowed")
	private boolean isReadAllowed;

	@SerializedName("entityId")
	private int entityId;

	@SerializedName("userType")
	private String userType;

	@SerializedName("isDeleteAllowed")
	private boolean isDeleteAllowed;

	public void setIsSubscribed(boolean isSubscribed){
		this.isSubscribed = isSubscribed;
	}

	public boolean isIsSubscribed(){
		return isSubscribed;
	}

	public void setEntityType(String entityType){
		this.entityType = entityType;
	}

	public String getEntityType(){
		return entityType;
	}

	public void setIsCreateAllowed(boolean isCreateAllowed){
		this.isCreateAllowed = isCreateAllowed;
	}

	public boolean isIsCreateAllowed(){
		return isCreateAllowed;
	}

	public void setIsUpdateAllowed(boolean isUpdateAllowed){
		this.isUpdateAllowed = isUpdateAllowed;
	}

	public boolean isIsUpdateAllowed(){
		return isUpdateAllowed;
	}

	public void setIsReadAllowed(boolean isReadAllowed){
		this.isReadAllowed = isReadAllowed;
	}

	public boolean isIsReadAllowed(){
		return isReadAllowed;
	}

	public void setEntityId(int entityId){
		this.entityId = entityId;
	}

	public int getEntityId(){
		return entityId;
	}

	public void setUserType(String userType){
		this.userType = userType;
	}

	public String getUserType(){
		return userType;
	}

	public void setIsDeleteAllowed(boolean isDeleteAllowed){
		this.isDeleteAllowed = isDeleteAllowed;
	}

	public boolean isIsDeleteAllowed(){
		return isDeleteAllowed;
	}

	@Override
 	public String toString(){
		return 
			"SubscribedAppsItem{" + 
			"isSubscribed = '" + isSubscribed + '\'' + 
			",entityType = '" + entityType + '\'' + 
			",isCreateAllowed = '" + isCreateAllowed + '\'' + 
			",isUpdateAllowed = '" + isUpdateAllowed + '\'' + 
			",isReadAllowed = '" + isReadAllowed + '\'' + 
			",entityId = '" + entityId + '\'' + 
			",userType = '" + userType + '\'' + 
			",isDeleteAllowed = '" + isDeleteAllowed + '\'' + 
			"}";
		}
}