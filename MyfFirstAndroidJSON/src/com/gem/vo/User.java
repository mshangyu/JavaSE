package com.gem.vo;

public class User {
	private int userId;
	private String userName;
	private String password;
	private String eMail;
	private String sex;
	private String phoneNumber;

	public User() {
	}

	public User(int userId, String userName, String password, String eMail,
			String sex, String phoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User(int userId, String userName, String eMail, String sex) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.eMail = eMail;
		this.sex = sex;
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public User(String userName, String password, String eMail, String sex,
			String phoneNumber) {
		super();
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
	}

	

}
