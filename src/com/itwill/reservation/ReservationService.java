package com.itwill.reservation;

public class ReservationService {

	/***** 예약취소  *****/
	public void remove(int passNo) throws Exception {
		ReservationDAO reservationDao = new ReservationDAO();
		
		reservationDao.delete(passNo);
	}
	
	
	
}
