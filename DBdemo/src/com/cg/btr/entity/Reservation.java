package com.cg.btr.entity;
import java.sql.Date;
public class Reservation
{
	int reservationId;
	Date reservationDate;
	Bus bus;
	Passenger passenger;
	Date travelDate;
	int seatNo;
	String status;
	public int getReservationid() {
		return reservationId;
	}
	public void setReservationid(int reservationid) {
		this.reservationId = reservationid;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Reservation() {}
	public Reservation(int reservationId, Date reservationDate, Bus bus, Passenger passenger, Date travelDate,
			int seatNo, String status) {
		super();
		this.reservationId = reservationId;
		this.reservationDate = reservationDate;
		this.bus = bus;
		this.passenger = passenger;
		this.travelDate = travelDate;
		this.seatNo = seatNo;
		this.status = status;
	}
	

}
