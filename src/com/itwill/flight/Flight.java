package com.itwill.flight;

import java.io.Serializable;

public class Flight implements Serializable{
	
	private String flightName;
	private String seatRating;
	private String flightStartDate;
	private String flightFinishDate;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSeatRating() {
		return seatRating;
	}
	public void setSeatRating(String seatRating) {
		this.seatRating = seatRating;
	}
	public String getFlightStartDate() {
		return flightStartDate;
	}
	public void setFlightStartDate(String flightStartDate) {
		this.flightStartDate = flightStartDate;
	}
	public String getFlightFinishDate() {
		return flightFinishDate;
	}
	public void setFlightFinishDate(String flightFinishDate) {
		this.flightFinishDate = flightFinishDate;
	}
}
