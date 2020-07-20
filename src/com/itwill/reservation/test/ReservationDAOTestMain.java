package com.itwill.reservation.test;

import com.itwill.reservation.Reservation;
import com.itwill.reservation.ReservationDAO;

public class ReservationDAOTestMain {
	public static void main(String[] args) throws Exception {
		ReservationDAO reservationDAO = new ReservationDAO();
		
		System.out.println("--------------------- create ------------------------");
		boolean isSuccess = reservationDAO.create(new Reservation(
							"인천", "다낭", "30A", "2020.07.21", "2020.08.01", 2, "VIP", "1111"));
		System.out.println(isSuccess);
		isSuccess = reservationDAO.create(new Reservation("인천", "파리", "60A", "2020.07.22", "2020.10.01", 1, "Economy", "2222"));
		System.out.println(isSuccess);
		isSuccess = reservationDAO.create(new Reservation("김포", "제주도", "22F", "2020.12.24", "2021.1.01", 5, "Economy", "5555"));
		System.out.println(isSuccess);
		System.out.println();
		
		System.out.println("--------------------- readAll ------------------------");
		System.out.println(reservationDAO.readAll());
		System.out.println();

		System.out.println("--------------------- readOne ------------------------");
		System.out.println(reservationDAO.readOne("2222"));
		System.out.println();
		
		System.out.println("--------------------- update ------------------------");
		Reservation updateReserve = new Reservation("인천", "마드리드", "1A", "2020.12.29", "2021.12.22", 1, "VVVIP", "2222");
		reservationDAO.update(updateReserve);
		System.out.println(updateReserve);
		System.out.println();
		
		System.out.println("--------------------- delete ------------------------");
		reservationDAO.delete("5555");
		System.out.println(reservationDAO.readAll());
		
		
		
	}
}
