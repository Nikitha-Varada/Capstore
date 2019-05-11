package com.cg.lm.entity;
public class Student
{
	int student_id;
	String name;
	String address;
	long mobile;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int student_id, String name, String address, long mobile) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	

}
