package com.itwill.reservation;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable{



	private String startPoint;			//	출발지
	private String finishPoint;			//	도착지
	private String seatRating;			//	좌석등급
	private String startDate;				//	가는날
	private String comingDate;			//	오는날
	private int count;					//  승객
	private String passengerType;		//	승객유형
	private String reservationNo;		//	예약번호 - 추가했음
	


	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Reservation(String startPoint, String finishPoint, String seatRating, String startDate,
			String comingDate, int count, String passengerType, String reservationNo) {
		super();
		this.startPoint = startPoint;
		this.finishPoint = finishPoint;
		this.seatRating = seatRating;
		this.startDate = startDate;
		this.comingDate = comingDate;
		this.count = count;
		this.passengerType = passengerType;
		this.reservationNo = reservationNo;
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


	public String getSeatRating() {
		return seatRating;
	}
  

	public void setSeatRating(String seatRating) {
		this.seatRating = seatRating;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getComingDate() {
		return comingDate;
	}


	public void setComingDate(String comingDate) {
		this.comingDate = comingDate;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getPassengerType() {
		return passengerType;
	}


	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}


	public String getReservationNo() {
		return reservationNo;
	}


	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}





