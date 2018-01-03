package com.example.bagasgr.myapplication.model.dashboardModel;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DashboardResponse {

	@SerializedName("data")
	private List<DashboardDataItem> data;

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("status")
	private Status status;

	public void setData(List<DashboardDataItem> data){
		this.data = data;
	}

	public List<DashboardDataItem> getData(){
		return data;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"DashboardResponse{" +
			"data = '" + data + '\'' + 
			",meta = '" + meta + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}