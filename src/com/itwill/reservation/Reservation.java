package com.itwill.reservation;

import java.io.Serializable;

import com.itwill.flight.Flight;
import com.itwill.passenger.Passenger;

public class Reservation implements Serializable {

	private int reservationNo; // 예약번호
	private String seatRating; // 좌석등급
	private int adultCount; // 성인 수
	private int childCount; // 유아 수
	private int count; // 승객
	private Flight flight; // 포함
	private Passenger passenger; // 포함
	private static int inherenceReserveNo = 1000; // 예약번호 생성

	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(int reservationNo, String seatRating, int adultCount, int childCount, Flight flight) {
		super();
		this.reservationNo = reservationNo;
		this.seatRating = seatRating;
		this.adultCount = adultCount;
		this.childCount = childCount;		
		this.flight = flight;
	}

	public Reservation(String seatRating, int adultCount, int childCount, Flight flight, Passenger passenger) {
		super();
		this.seatRating = seatRating;
		this.adultCount = adultCount;
		this.childCount = childCount;
		this.count = adultCount + childCount;
		this.reservationNo = generateNo();
		this.flight = flight;
		this.passenger = passenger;
	}

	/*
	 * 요금 계산
	 */
	public double calculateFee() throws Exception {
		double calFee = 0; // 리턴값
		// 1. 성인요금
		double adultFee = flight.getFee() * adultCount;
		// 1-2. 유아요금
		double childFee = flight.getFee() * childCount * 0.9;
		// 1.3 기본 합계 요금
		calFee = adultFee + childFee;
		if (seatRating.equals("business")) {
			// 2. 비즈니스 요금
			calFee = (adultFee + childFee) * 1.3;
		}
		return calFee;
	}

	@Override
	public String toString() {
		return "Reservation [reservationNo=" + reservationNo + ", seatRating=" + seatRating + ", adultCount="
				+ adultCount + ", childCount=" + childCount + ", count=" + count + ", flight=" + flight + ", passenger="
				+ passenger + "]" + "\n";
	}

	public int generateNo() {
		int reservationNo = inherenceReserveNo++;
		return reservationNo;
	}

	public static int getInherenceReserveNo() {
		return inherenceReserveNo;
	}

	public static void setInherenceReserveNo(int inherenceReserveNo) {
		Reservation.inherenceReserveNo = inherenceReserveNo;
	}

	public String getSeatRating() {
		return seatRating;
	}

	public void setSeatRating(String seatRating) {
		this.seatRating = seatRating;
	}

	public int getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}

	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

}
