package com.itwill.flight;

import java.io.Serializable;

public class Flight implements Serializable{
	
	private String flightName;
	private String flightStartDate;
	private String flightFinishDate;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	public Flight(String flightName, String flightStartDate, String flightFinishDate) {
		super();
		this.flightName = flightName;
		this.flightStartDate = flightStartDate;
		this.flightFinishDate = flightFinishDate;
	}

	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
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
