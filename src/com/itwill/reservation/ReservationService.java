package com.itwill.reservation;

import java.util.ArrayList;

public class ReservationService {

	private ReservationDAO reservationDAO;
	public ReservationService() throws Exception{
		reservationDAO = new ReservationDAO();
	}
	
	/*
	 * 예약정보 Add
	 */
	
	public void addReservation(Reservation addReservation) throws Exception {
		reservationDAO.create(addReservation);		
	}
	
	/*
	 * 예약취소
	 */
	public void remove(String reservationNo) throws Exception {
		reservationDAO.delete(reservationNo);
	}
	

	/*
	 * 예약정보 Update
	 */

	public void updateReservation(Reservation updateReservation) throws Exception {
		reservationDAO.update(updateReservation);
		 
 }
	
	/*
	 * 예약정보 전체 검색()
	 */
	public ArrayList<Reservation> findByAll() throws Exception {
		ArrayList<Reservation> reservationList = reservationDAO.readAll();
		return reservationList;
	}

	

}
