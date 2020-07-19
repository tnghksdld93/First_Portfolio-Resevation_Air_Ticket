package com.itwill.reservation;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable{
	private String startPoint;			//	Ãâ¹ßÁö
	private String finishPoint;			//	µµÂøÁö
	private int passengerNo;			//	½Â°´¼ö
	private String seatRating;			//	ÁÂ¼®µî±Þ
	private Date startDate;				//	°¡´Â³¯
	private Date comingDate;			//	¿À´Â³¯
	private String passengerType;		//	½Â°´À¯Çü
	
	
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
