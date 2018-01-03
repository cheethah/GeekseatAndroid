package com.example.bagasgr.myapplication.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Meta{

	@SerializedName("job2Job")
	private Object job2Job;

	@SerializedName("business")
	private Business business;

	@SerializedName("user")
	private User user;

	public void setJob2Job(Object job2Job){
		this.job2Job = job2Job;
	}

	public Object getJob2Job(){
		return job2Job;
	}

	public void setBusiness(Business business){
		this.business = business;
	}

	public Business getBusiness(){
		return business;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"job2Job = '" + job2Job + '\'' + 
			",business = '" + business + '\'' + 
			",user = '" + user + '\'' + 
			"}";
		}
}