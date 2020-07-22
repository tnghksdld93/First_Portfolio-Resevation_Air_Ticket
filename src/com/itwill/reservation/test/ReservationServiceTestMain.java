package com.itwill.reservation.test;

import java.util.ArrayList;

import com.itwill.reservation.Reservation;
import com.itwill.reservation.ReservationDAO;
import com.itwill.reservation.ReservationService;

public class ReservationServiceTestMain {
	public static void main(String[] args) throws Exception {
		ReservationService reservationService = new ReservationService();
		/*
		 * 예약정보 Add
		 */

		//reservationService.addReservation(new Reservation("인천","다낭","이코노미","2020.08.20","2020.9.10",1,"성인","2222"));
		//reservationService.addReservation(new Reservation("인천","파리","이코노미","2020.08.10","2020.12.25",4,"성인","3333"));
		//reservationService.addReservation(new Reservation("인천","몰타","비즈니스","2020.08.01","2020.8.10",3,"성인","4444"));
		
		/*
		 * 예약취소 
		 */
		//reservationService.remove("1111");
	
		
		/*
		 * 예약정보 Update
		 */
		//Reservation reservationService1 = new Reservation("인천","샌프란시스코","이코노미","2020.07.30","2020.8.30",2,"성인","1111");
		//reservationService.updateReservation(reservationService1);

	
		System.out.println(reservationService.findByAll());
		
		System.out.println(reservationService.readOneWay("다낭", 8, 12));
	
	
		
		
		
		
		
		
	}
}
