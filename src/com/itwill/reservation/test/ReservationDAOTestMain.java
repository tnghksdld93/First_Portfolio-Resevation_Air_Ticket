package com.itwill.reservation.test;

import com.itwill.flight.Flight;
import com.itwill.passenger.Passenger;
import com.itwill.reservation.Reservation;
import com.itwill.reservation.ReservationDAO;

public class ReservationDAOTestMain {
	public static void main(String[] args) throws Exception {
		ReservationDAO reservationDAO = new ReservationDAO();
		
		Flight flight1 = new Flight("id-1", 2020, 8, 20, "08:20", 2020, 8, 20, "13:30", "인천", "다낭", 2500000, "대한항공");
		Passenger passenger1 = new Passenger("xxx", "xxx", "김구달", "470123", "010-3333-4444");
		Flight flight2 = new Flight("if-1", 2020, 9, 23, "09:20", 2020, 9, 24, "08:30", "인천", "파리", 3000000, "아시아나");
		Passenger passenger2 = new Passenger("yyy", "yyy", "왕준식", "860723", "010-5555-6666");
		Flight flight3 = new Flight("in-1", 2020, 9, 13, "13:20", 2020, 9, 14, "14:30", "인천", "뉴욕", 4000000, "홍콩에어");
		Passenger passenger3 = new Passenger("zzz", "zzz", "박말자", "660223", "010-7777-8888");
		
		
		System.out.println("--------------------- create ------------------------");
		boolean isSuccess = reservationDAO.create(new Reservation("이코노미", 1, 1, flight1, passenger1));
		System.out.println(isSuccess);
		isSuccess = reservationDAO.create(new Reservation("비지니스", 4, 20, flight2, passenger2));
		System.out.println(isSuccess);
		isSuccess = reservationDAO.create(new Reservation("이코노미", 2, 0, flight3, passenger3));
		System.out.println(isSuccess);
		
		
		System.out.println("--------------------- readAll ------------------------");
		System.out.println(reservationDAO.readAll());
		System.out.println();

		System.out.println("--------------------- readOne ------------------------");
		System.out.println(reservationDAO.readOne(1002));
		
		System.out.println("--------------------- update ------------------------");
		//Flight flight4 = new Flight("il-1", 2020, 9, 30, "11:20", 2020, 10, 1, "11:30", "인천", "런던", 4300000);
		//Reservation updateReservation = new Reservation("비지니스", 3, 0, flight4, passenger2);
		//reservationDAO.update(updateReservation);
		System.out.println(reservationDAO.readAll());
		
		System.out.println("--------------------- delete ------------------------");
		reservationDAO.delete(1002);
		System.out.println(reservationDAO.readAll());
		
		
		
	}
}
