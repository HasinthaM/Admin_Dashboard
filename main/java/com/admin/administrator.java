package com.admin;

public class administrator {

	private int aID;
	private String aFirstName;
	private String aLastName;
	private String uName;
	private String aEmail;
	private String uPass;
	private String aPhoneNo;

	// overlorded Constructor to initialize an Administrator object
	public administrator(int aID, String aFirstName, String aLastName, String uName, String aEmail, String uPass,
			String aPhoneNo) {
		this.aID = aID;
		this.aFirstName = aFirstName;
		this.aLastName = aLastName;
		this.uName = uName;
		this.aEmail = aEmail;
		this.uPass = uPass;
		this.aPhoneNo = aPhoneNo;
	}

	// Getter methods to retrieve values of administrator properties
	public int getaID() {
		return aID;
	}

	public String getaFirstName() {
		return aFirstName;
	}

	public String getaLastName() {
		return aLastName;
	}

	public String getuName() {
		return uName;
	}

	public String getaEmail() {
		return aEmail;
	}

	public String getuPass() {
		return uPass;
	}

	public String getaPhoneNo() {
		return aPhoneNo;
	}

}
