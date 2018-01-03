package com.example.bagasgr.myapplication.model.dashboardModel;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Status{

	@SerializedName("fieldMessages")
	private List<Object> fieldMessages;

	@SerializedName("type")
	private String type;

	@SerializedName("message")
	private Object message;

	public void setFieldMessages(List<Object> fieldMessages){
		this.fieldMessages = fieldMessages;
	}

	public List<Object> getFieldMessages(){
		return fieldMessages;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setMessage(Object message){
		this.message = message;
	}

	public Object getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"Status{" + 
			"fieldMessages = '" + fieldMessages + '\'' + 
			",type = '" + type + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}