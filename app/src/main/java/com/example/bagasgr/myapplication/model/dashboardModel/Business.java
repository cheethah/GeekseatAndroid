package com.example.bagasgr.myapplication.model.dashboardModel;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Business{

	@SerializedName("lastRequested")
	private int lastRequested;

	@SerializedName("profileLastUpdate")
	private int profileLastUpdate;

	@SerializedName("lastInvited")
	private int lastInvited;

	@SerializedName("lastConnected")
	private int lastConnected;

	@SerializedName("businessId")
	private int businessId;

	@SerializedName("teamMemberLastUpdate")
	private int teamMemberLastUpdate;

	public void setLastRequested(int lastRequested){
		this.lastRequested = lastRequested;
	}

	public int getLastRequested(){
		return lastRequested;
	}

	public void setProfileLastUpdate(int profileLastUpdate){
		this.profileLastUpdate = profileLastUpdate;
	}

	public int getProfileLastUpdate(){
		return profileLastUpdate;
	}

	public void setLastInvited(int lastInvited){
		this.lastInvited = lastInvited;
	}

	public int getLastInvited(){
		return lastInvited;
	}

	public void setLastConnected(int lastConnected){
		this.lastConnected = lastConnected;
	}

	public int getLastConnected(){
		return lastConnected;
	}

	public void setBusinessId(int businessId){
		this.businessId = businessId;
	}

	public int getBusinessId(){
		return businessId;
	}

	public void setTeamMemberLastUpdate(int teamMemberLastUpdate){
		this.teamMemberLastUpdate = teamMemberLastUpdate;
	}

	public int getTeamMemberLastUpdate(){
		return teamMemberLastUpdate;
	}

	@Override
 	public String toString(){
		return 
			"Business{" + 
			"lastRequested = '" + lastRequested + '\'' + 
			",profileLastUpdate = '" + profileLastUpdate + '\'' + 
			",lastInvited = '" + lastInvited + '\'' + 
			",lastConnected = '" + lastConnected + '\'' + 
			",businessId = '" + businessId + '\'' + 
			",teamMemberLastUpdate = '" + teamMemberLastUpdate + '\'' + 
			"}";
		}
}