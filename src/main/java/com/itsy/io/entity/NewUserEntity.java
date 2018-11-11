package com.itsy.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity(name="NewUser")
public class NewUserEntity implements Serializable {
	private static final long serialVersionUID = -4245173302323747424L;
	
	@Id 
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column
	private String userId;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	
}
