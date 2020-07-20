package com.itwill.reservation;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable{


	private String startPoint;			//	출발지
	private String finishPoint;			//	도착지
	private int passengerNo;			//	승객수
	private String seatRating;			//	좌석등급
	private Date startDate;				//	가는날
	private Date comingDate;			//	오는날
	private String passengerType;	//	승객유형
	private int count;						// 승객수 
	
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}
	public String getFinishPoint() {
		return finishPoint;
	}
	public void setFinishPoint(String finishPoint) {
		this.finishPoint = finishPoint;
	}
	public int getPassengerNo() {
		return passengerNo;
	}
	public void setPassengerNo(int passengerNo) {
		this.passengerNo = passengerNo;
	}
	public String getSeatRating() {
		return seatRating;
	}
	public void setSeatRating(String seatRating) {
		this.seatRating = seatRating;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getComingDate() {
		return comingDate;
	}
	public void setComingDate(Date comingDate) {
		this.comingDate = comingDate;
	}  
	public String getPassengerType() {
		return passengerType;
	}
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	
	public int getCount() {
		return count;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}





