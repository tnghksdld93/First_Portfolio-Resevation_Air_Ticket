package com.itwill.reservation;

import java.util.ArrayList;

import com.itwill.flight.Flight;
import com.itwill.flight.FlightDAO;

public class ReservationService {

	private ReservationDAO reservationDAO;
	private FlightDAO flightDAO;
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
	public void remove(int reservationNo) throws Exception {
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
	
	
	/*
	 * 항공편 검색 (편도)
	 */

	public ArrayList<Flight> readOneWay(String finishPoint, int flightStartMonth, int flightStartday) throws Exception{     //????????test 필수
		ArrayList<Flight> flightList = flightDAO.readFile();
		ArrayList<Flight> temp = null;
		for (Flight flight : flightList) {
			if (flight.getFinishPoint().equals(finishPoint) && 
					flight.getFlightStartMonth() == flightStartMonth && 
					flight.getFlightStartDay() >= flightStartday ) {
					temp.add(flight);
			}
		}
		return temp;
	}
	/*
	 * 항공편 검색 (왕복)
	 */
	
	public ArrayList<Flight> readRoundTrip(String startPoint, String finishPoint, int flightStartMonth, int flightStartDay) throws Exception{     //????????test 필수
		ArrayList<Flight> flightList = flightDAO.readFile();
		ArrayList<Flight> temp = null;
		for (Flight flight : flightList) {
			if (flight.getFinishPoint().equals("인천") && 
					flight.getStartPoint().equals(startPoint) &&
					flight.getFlightFinishMonth() == flightStartMonth && 
					flight.getFlightFinishDay() >= flightStartDay ) {
					temp.add(flight);
			}
		}
		return temp;
	}
	
	
	


	

}
