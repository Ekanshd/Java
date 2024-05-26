package com.may23;
public class Facebook {

	int fid;
	String fbProfile;
	long contactNo;
	public Facebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facebook(int fid, String fbProfile, long contactNo) {
		super();
		this.fid = fid;
		this.fbProfile = fbProfile;
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "FaceBook [fid=" + fid + ", fbProfile=" + fbProfile + ", contactNo=" + contactNo + "]";
	}
	
}