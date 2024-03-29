package platformManager;

public class Manager {
	private int mID;
	private String mFirstName;
	private String mLastName;
	private String uName;
	private String mEmail;
	private String uPass;
	private String mPhoneNo;
	
	public Manager(int mID, String mFirstName, String mLastName, String uName, String mEmail, String uPass,
			String mPhoneNo) {
		this.mID = mID;
		this.mFirstName = mFirstName;
		this.mLastName = mLastName;
		this.uName = uName;
		this.mEmail = mEmail;
		this.uPass = uPass;
		this.mPhoneNo = mPhoneNo;
	}

	public int getmID() {
		return mID;
	}

	public String getmFirstName() {
		return mFirstName;
	}

	public String getmLastName() {
		return mLastName;
	}

	public String getuName() {
		return uName;
	}

	public String getmEmail() {
		return mEmail;
	}

	public String getuPass() {
		return uPass;
	}

	public String getmPhoneNo() {
		return mPhoneNo;
	}	
}