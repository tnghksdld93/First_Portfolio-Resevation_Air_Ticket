package com.itwill.reservation;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.passenger.Passenger;


public class ReservationDAO {
	private File ReservationFile;
	
	
	public ReservationDAO() throws Exception{
		ReservationFile = new File("reservation.ser");
		if (!ReservationFile.exists()) {
			System.out.println("파일생성[reservation.ser]");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ReservationFile));
			oos.writeObject(new ArrayList<Reservation>());
		}
	}
	
	
	/**********************************************/
	private ArrayList<Reservation> readFile() throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ReservationFile));
		ArrayList<Reservation> reservationList = (ArrayList<Reservation>) ois.readObject();
		ois.close();
		return reservationList;
	}
	
	private void writeFile(ArrayList<Reservation> reservationList) throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ReservationFile));
		oos.writeObject(reservationList);
		oos.close();
	}
	
	
	/*
	 * Create		
	 */
	public boolean create(Reservation addReservation) throws Exception {
		boolean isSuccess = false;
		ArrayList<Reservation> reservationList = readFile();
		if (isDuplicateReserveNo(addReservation.getReservationNo())) {
			isSuccess = true;
			return isSuccess;
		}
		isSuccess = true;
		reservationList.add(addReservation);
		writeFile(reservationList);
		return isSuccess;
	}
	
	public boolean isDuplicateReserveNo(String reservationNo) throws Exception{
		boolean isDuplicate = false;
		ArrayList<Reservation> reservationList = readFile();
		for (Reservation reservation : reservationList) {
			if (reservation.getReservationNo().equals(reservationNo)) {
				isDuplicate = true;
				break;
			}
		}
		return isDuplicate;
	}
	
	
	/*
	 * readAll
	 */
	public ArrayList<Reservation> readAll() throws Exception{
		return readFile();
	}
	
	
	/*
	 *  readOne
	 */
	public Reservation readOne(String reservationNo) throws Exception {
		Reservation findReservation = null;
		ArrayList<Reservation> reservationList = readFile();
		for (Reservation reservation : reservationList) {
			if (reservation.getReservationNo().equals(reservationNo)) {
				findReservation = reservation;
				break;
			}
		}
		return findReservation;
	}
	
	
	/*
	 *  update
	 */
	public void update(Reservation updateReservation) throws Exception{
		ArrayList<Reservation> reservationList = this.readFile();
		for (Reservation reservation : reservationList) {
			if (reservation.getReservationNo().equals(updateReservation.getReservationNo())) {
				reservation.setStartPoint(updateReservation.getStartPoint());
				reservation.setFinishPoint(updateReservation.getFinishPoint());
				reservation.setPassengerNo(updateReservation.getPassengerNo());
				reservation.setStartDate(updateReservation.getStartDate());
				reservation.setComingDate(updateReservation.getComingDate());
				reservation.setPassengerType(updateReservation.getPassengerType());
				reservation.setSeatRating(updateReservation.getSeatRating());
				break;
			}
		}
	}
	
	
	/*
	 *  delete
	 */
	public void delete(String reservationNo) throws Exception{
		ArrayList<Reservation> reservationList = readFile();
		for (Reservation reservation : reservationList) {
			if (reservation.getReservationNo().equals(reservationNo)) {
				reservationList.remove(reservation);
				break;
			}
		}
		writeFile(reservationList);
	}
}
