package com.itwill.flight;

import java.io.Serializable;

public class Flight implements Serializable{
	
	private String flightName;
	private int flightStartYear;
	private int flightStartMonth;
	private int flightStartDay;
	private String flightStartTime;
	private int flightFinishYear;
	private int flightFinishMonth;
	private int flightFinishDay;
	private String flightFinishTime;
	

	
	

	public Flight() {
		// TODO Auto-generated constructor stub
	}





	public Flight(String flightName, int flightStartYear, int flightStartMonth, int flightStartDay,
			String flightStartTime, int flightFinishYear, int flightFinishMonth, int flightFinishDay, String flightFinishTime) {
		super();
		this.flightName = flightName;
		this.flightStartTime = flightStartTime;
		this.flightStartYear = flightStartYear;
		this.flightStartMonth = flightStartMonth;
		this.flightStartDay = flightStartDay;
		this.flightFinishTime = flightFinishTime;
		this.flightFinishYear = flightFinishYear;
		this.flightFinishMonth = flightFinishMonth;
		this.flightFinishDay = flightFinishDay;
	}





	public String getFlightName() {
		return flightName;
	}





	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}





	public String getFlightStartTime() {
		return flightStartTime;
	}





	public void setFlightStartTime(String flightStartTime) {
		this.flightStartTime = flightStartTime;
	}





	public int getFlightStartYear() {
		return flightStartYear;
	}





	public void setFlightStartYear(int flightStartYear) {
		this.flightStartYear = flightStartYear;
	}





	public int getFlightStartMonth() {
		return flightStartMonth;
	}





	public void setFlightStartMonth(int flightStartMonth) {
		this.flightStartMonth = flightStartMonth;
	}





	public int getFlightStartDay() {
		return flightStartDay;
	}





	public void setFlightStartDay(int flightStartDay) {
		this.flightStartDay = flightStartDay;
	}





	public String getFlightFinishTime() {
		return flightFinishTime;
	}





	public void setFlightFinishTime(String flightFinishTime) {
		this.flightFinishTime = flightFinishTime;
	}





	public int getFlightFinishYear() {
		return flightFinishYear;
	}





	public void setFlightFinishYear(int flightFinishYear) {
		this.flightFinishYear = flightFinishYear;
	}





	public int getFlightFinishMonth() {
		return flightFinishMonth;
	}





	public void setFlightFinishMonth(int flightFinishMonth) {
		this.flightFinishMonth = flightFinishMonth;
	}





	public int getFlightFinishDay() {
		return flightFinishDay;
	}





	public void setFlightFinishDay(int flightFinishDay) {
		this.flightFinishDay = flightFinishDay;
	}
	
	
}
