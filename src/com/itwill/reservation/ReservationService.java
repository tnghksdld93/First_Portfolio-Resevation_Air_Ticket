package com.itwill.reservation;

public class ReservationService {

	private ReservationDAO reservationDAO;

	public ReservationService() throws Exception{
			reservationDAO = new ReservationDAO();
	}
	/*
	 * 예약정보 Update
	 */

	public void updateReservation(Reservation updateReservation) throws Exception {
		reservationDAO.update(updateReservation);
		
	
 }
	/*
	 * 예약정보 Add
	 */
	
	public void addReservation(Reservation addReservation) throws Exception {
		reservationDAO.create(addReservation);
		
		
	}

}
