package com.itsy.middleware;

import java.io.Serializable;


public class NewUserDTO implements Serializable {

	private static final long serialVersionUID = -7907090927072256047L;
	
	private String username;
    private String email;
 
   
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
}
