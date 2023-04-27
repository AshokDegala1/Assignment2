package com.kpmg.bean;

public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int sid;
	private String sname;
	private String sclass;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public Student(int sid, String sname, String sclass) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sclass = sclass;
	}

	
}
