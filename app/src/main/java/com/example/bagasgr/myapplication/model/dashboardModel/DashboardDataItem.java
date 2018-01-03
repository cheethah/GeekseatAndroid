package com.example.bagasgr.myapplication.model.dashboardModel;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DashboardDataItem {

	@SerializedName("connectedBusinessCount")
	private int connectedBusinessCount;

	@SerializedName("teamMemberCount")
	private int teamMemberCount;

	@SerializedName("pendingInvitationCount")
	private int pendingInvitationCount;

	@SerializedName("connectRequestCount")
	private int connectRequestCount;

	public void setConnectedBusinessCount(int connectedBusinessCount){
		this.connectedBusinessCount = connectedBusinessCount;
	}

	public int getConnectedBusinessCount(){
		return connectedBusinessCount;
	}

	public void setTeamMemberCount(int teamMemberCount){
		this.teamMemberCount = teamMemberCount;
	}

	public int getTeamMemberCount(){
		return teamMemberCount;
	}

	public void setPendingInvitationCount(int pendingInvitationCount){
		this.pendingInvitationCount = pendingInvitationCount;
	}

	public int getPendingInvitationCount(){
		return pendingInvitationCount;
	}

	public void setConnectRequestCount(int connectRequestCount){
		this.connectRequestCount = connectRequestCount;
	}

	public int getConnectRequestCount(){
		return connectRequestCount;
	}

	@Override
 	public String toString(){
		return 
			"DashboardDataItem{" +
			"connectedBusinessCount = '" + connectedBusinessCount + '\'' + 
			",teamMemberCount = '" + teamMemberCount + '\'' + 
			",pendingInvitationCount = '" + pendingInvitationCount + '\'' + 
			",connectRequestCount = '" + connectRequestCount + '\'' + 
			"}";
		}
}