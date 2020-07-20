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
	private File reservationFile;
	
	
	public ReservationDAO() throws Exception{
		reservationFile = new File("reservation.ser");
		if (!reservationFile.exists()) {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(reservationFile));
			oos.writeObject(new ArrayList<Reservation>());
		}
	}
	
	
	/**********************************************/
	private ArrayList<Reservation> readFile() throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(reservationFile));
		ArrayList<Reservation> reservationList = (ArrayList<Reservation>) ois.readObject();
		ois.close();
		return reservationList;
	}
	
	private void writeFile(ArrayList<Reservation> reservationList) throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(reservationFile));
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
				reservation.setStartDate(updateReservation.getStartDate());
				reservation.setComingDate(updateReservation.getComingDate());
				reservation.setPassengerType(updateReservation.getPassengerType());
				reservation.setSeatRating(updateReservation.getSeatRating());
				break;
			}
		}
		writeFile(reservationList);
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
