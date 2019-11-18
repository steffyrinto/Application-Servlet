package com.face.bo;

public class LoginBO {
	private String Username;
	private String Password;
	private String RePassword;
	private String Email;
	private String Collegename;
	private String Mobilenum;
	
	public String getRePassword() {
		return RePassword;
	}
	public void setRePassword(String rePassword) {
		RePassword = rePassword;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	public String getMobilenum() {
		return Mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		Mobilenum = mobilenum;
	}
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
