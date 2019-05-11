package com.cg.btr.entity;
import java.sql.Time;
public class Bus 
{
  int id;
  Routes route;
  int seats;
  double fare;
  Time arrtime;
  Time deptime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Routes getRoute() {
	return route;
}
public void setRoute(Routes route) {
	this.route = route;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public double getFare() {
	return fare;
}
public void setFare(double fare) {
	this.fare = fare;
}
public Time getArrtime() {
	return arrtime;
}
public void setArrtime(Time arrtime) {
	this.arrtime = arrtime;
}
public Time getDeptime() {
	return deptime;
}
public void setDeptime(Time deptime) {
	this.deptime = deptime;
}
public Bus() {
	super();
	// TODO Auto-generated constructor stub
}
public Bus(int id, Routes route, int seats, double fare, Time arrtime, Time deptime) {
	super();
	this.id = id;
	this.route = route;
	this.seats = seats;
	this.fare = fare;
	this.arrtime = arrtime;
	this.deptime = deptime;
}

}
