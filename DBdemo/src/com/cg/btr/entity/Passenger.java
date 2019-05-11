package com.cg.btr.entity;
public class Passenger
{
	int passengerid;
	String name;
	int age;
	char gender;
	long mobile;
	public int getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Passenger() {}
		public Passenger(int passengerid, String name, int age, char gender, long mobile) {
		super();
		this.passengerid = passengerid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
	}
	

}
