package com.itwill.flight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FlightDAO {

	private File flightFile;
	
	public FlightDAO() throws Exception{
		/***********************************[**********/
		flightFile = new File("flights.ser");
		if (!flightFile.exists()) {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fligths.ser"));
			oos.writeObject(new ArrayList<Flight>());
		}
		
	}
		
		/*********************************************/
		
	private ArrayList<Flight> readFile() throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(flightFile));
		ArrayList<Flight> flightList = (ArrayList<Flight>)ois.readObject();
		ois.close();
		return flightList;
	}
		
	private void writeFile(ArrayList<Flight> flightList) throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(flightFile));
		oos.writeObject(flightList);
		oos.close();
	
	
	}
	
	/*
	 * create
	 */
	public boolean create(Flight addFlight) throws Exception{
		boolean isSuccess = false;
		ArrayList<Flight> flightList = this.readFile();
		if (isDuplicateName(addFlight.getFlightName())) {
			isSuccess = false;
			return isSuccess;
		}
		isSuccess = true;
		flightList.add(addFlight);
		this.writeFile(flightList);
		return isSuccess;
		
	}
	
	public boolean isDuplicateName(String flightName) throws Exception{
		boolean isDuplicate = false;
		ArrayList<Flight> flightList = this.readFile();
		for (Flight flight : flightList) {
			if (flight.getFlightName().equals(flightName)) {
				isDuplicate = true;
				break;
			}
		}
		return isDuplicate;
	}
	
	
	public ArrayList<Flight> readAll() throws Exception{
		return this.readFile();
	}
	 
	
	public Flight readOne(String flightName) throws Exception{
		Flight findFlight = null;
		ArrayList<Flight> flightList = this.readFile();
		for (Flight flight : flightList) {
			if (flight.getFlightName().equals(flightName)) {
				findFlight = flight;
				break;
			}
		}
		return findFlight;
	}
	
	
	public void update(Flight updateFlight) throws Exception {
		ArrayList<Flight> flightList = readFile();
		for (Flight flight : flightList) {
			if (flight.getFlightName().equals(updateFlight.getFlightName())) {
				flight.setFlightFinishDate(updateFlight.getFlightFinishDate());
				flight.setFlightStartDate(updateFlight.getFlightStartDate());
				flight.setSeatRating(updateFlight.getSeatRating());
				 
				break;
			}
		}
		writeFile(flightList);
	}
	
	public void delete(String flightName) throws Exception{
		ArrayList<Flight> flightList = this.readFile();
		for (Flight flight : flightList) {
			if (flight.getFlightName().equals(flightName)) {
				flightList.remove(flight);
				break;
			}
		}
		this.writeFile(flightList);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
