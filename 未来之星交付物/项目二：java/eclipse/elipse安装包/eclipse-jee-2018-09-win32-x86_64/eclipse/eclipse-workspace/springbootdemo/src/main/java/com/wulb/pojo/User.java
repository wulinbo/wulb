package com.wulb.pojo;

public class User {
	private int uid;
	private String uname;
	private String usex;
	private String hoby;
	
	public User() {
		
	}

	public User(int uid, String uname, String usex, String hoby) {
		this.uid = uid;
		this.uname = uname;
		this.usex = usex;
		this.hoby = hoby;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String getHoby() {
		return hoby;
	}

	public void setHoby(String hoby) {
		this.hoby = hoby;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", usex=" + usex + ", hoby=" + hoby + "]";
	}
	
	
}
