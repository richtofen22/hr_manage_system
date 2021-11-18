package com.rain.domain;

import java.io.Serializable;

public class User implements Serializable {
	private Integer id;
	private String username;
	private String loginname;
	private String password;
	private String userphone;
	private String userschool;
	private String userage;
	private String userinstruction;
	
	public User(){
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUserschool() {
		return userschool;
	}
	public void setUserschool(String userschool) {
		this.userschool = userschool;
	}
	public String getUserage() {
		return userage;
	}
	public void setUserage(String userage) {
		this. userage=userage ;
	}
	public String getUserinstruction() {
		return userinstruction;
	}
	public void setUserinstruction(String userinstruction) {
		this. userinstruction=userinstruction ;
	}
	
}
