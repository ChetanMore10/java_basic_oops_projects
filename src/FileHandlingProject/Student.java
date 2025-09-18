package FileHandlingProject;

public class Student {
	private int id;
	private String fName;
	private String mName;
	private String lName;
	private long mobileNum;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public long setMobileNum(long mobileNum) {
		return this.mobileNum = mobileNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student id : " + id + "\nfName : " + fName + "\nmName : " + mName + "\nlName : " + lName
				+ "\nmobileNum : " + mobileNum + "\naddress :" + address + "";
	}

}
