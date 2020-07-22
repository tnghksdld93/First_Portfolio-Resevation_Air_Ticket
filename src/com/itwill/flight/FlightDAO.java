package com.itwill.flight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FlightDAO {

	public File flightFile;

	
	public FlightDAO() throws Exception{
		/*********************************************/
		flightFile = new File("flights.ser");
		if (!flightFile.exists()) {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(flightFile));
			
			ArrayList<Flight> flightList = new ArrayList<Flight>();
			flightList.add(new Flight("LJ-111", 2020, 8, 1, "08:30", 2020, 8, 1, "13:30", "인천", "다낭", 300000, "진에어" ));
			flightList.add(new Flight("LCC-132", 2020, 8, 23, "14:40", 2020, 8, 23, "19:40", "인천", "다낭", 350000, "이스타항공"));
			flightList.add(new Flight("TW-014", 2020, 9, 17, "21:20", 2020, 9, 18, "26:30", "인천", "다낭", 320000, "티웨이항공"));
			flightList.add(new Flight("KAL-033", 2020, 8, 10, "11:40", 2020, 8, 10, "15:10", "다낭", "인천", 310000, "대한항공"));
			flightList.add(new Flight("TW-392", 2020, 9, 10, "08:20", 2020, 9, 10, "13:50", "다낭", "인천", 330000, "티웨이항공"));
			flightList.add(new Flight("OZ-012", 2020, 9,24, "12:00" , 2020, 9, 24, "17:00", "다낭", "인천", 310000, "아시아나"));
			flightList.add(new Flight("KAL-099", 2020, 8, 8, "13:20", 2020, 8, 9, "04:50", "인천", "파리", 650000, "대한항공"));
			flightList.add(new Flight("LCC-039", 2020, 8, 18, "07:20", 2020, 8, 19, "23:50", "인천", "파리", 700000, "이스타항공"));
			flightList.add(new Flight("OZ-433", 2020, 9, 14, "12:20", 2020, 9, 15, "5:50", "인천", "파리", 750000, "아시아나항공"));
			flightList.add(new Flight("KAL-199", 2020, 8, 13, "11:20", 2020, 8, 14, "03:50", "파리", "인천", 890000, "대한항공"));
			flightList.add(new Flight("OZ-319", 2020, 9, 12, "15:20", 2020, 9, 13, "07:50", "파리", "인천", 780000, "아시아나"));
			flightList.add(new Flight("TW-933", 2020, 9, 28, "19:20", 2020, 9, 29, "14:00", "파리", "인천", 820000, "티웨이항공"));
			flightList.add(new Flight("LJ-887", 2020, 8, 5, "15:30", 2020, 8, 6, "11:50", "인천", "런던", 820000, "진에어"));
			flightList.add(new Flight("LJ-338",2020, 8, 9, "08:30", 2020, 8, 10,  "13:29", "인천", "런던", 920000, "진에어"));
			flightList.add(new Flight("KAL-228", 2020, 9, 1, "09:10", 2020, 9, 2, "03:40", "인천", "런던", 980000, "대한항공"));
			flightList.add(new Flight("OZ-782", 2020, 9, 3, "13:20", 2020, 9, 4, "07:40", "런던", "인천", 840000, "아시아나"));
			flightList.add(new Flight("TW-193", 2020, 9, 16, "14:40", 2020, 9, 17, "9:00", "런던", "인천", 910000, "티웨이"));
			flightList.add(new Flight("LCC-564", 2020, 9, 23, "11:00", 2020, 9, 24, "6:40", "런던", "인천", 930000, "이스타항공"));
			flightList.add(new Flight("OZ-111", 2020, 8, 05, "10:10", 2020, 8, 06, "09:15", "인천", "뉴욕", 718540, "아시아나"));
			flightList.add(new Flight("KE-333", 2020, 9, 17, "13:35", 2020, 9, 18, "11:50", "인천", "뉴욕", 957480, "대한항공"));
			flightList.add(new Flight("TW-666", 2020, 9, 03, "20:05", 2020, 9, 05, "01:40", "인천", "뉴욕", 667870, "티웨이"));
			flightList.add(new Flight("LJ-222", 2020, 8, 23, "17:30", 2020, 8, 24, "15:10", "뉴욕", "인천", 656500, "진에어"));
			flightList.add(new Flight("ZE-777", 2020, 9, 15, "09:30", 2020, 9, 16, "5:55", "뉴욕", "인천", 547400, "이스타"));
			flightList.add(new Flight("OZ-999", 2020, 9, 29, "01:00", 2020, 9, 30, "21:50", "뉴욕", "인천", 877000, "아시아나"));
			flightList.add(new Flight("KE-444", 2020, 8, 10, "07:25", 2020, 8, 11, "19:15", "인천", "마드리드", 514100, "대한항공"));
			flightList.add(new Flight("LJ-888", 2020, 8, 28, "12:50", 2020, 8, 29, "12:37", "인천", "마드리드", 466790, "진에어"));
			flightList.add(new Flight("ZE-112", 2020, 9, 20, "02:10", 2020, 9, 21, "10:00", "인천", "마드리드", 736540, "이스타"));
			flightList.add(new Flight("OZ-555", 2020, 8, 22, "16:00", 2020, 8, 23, "04:25", "마드리드", "인천", 978800, "아시아나"));
			flightList.add(new Flight("TW-223", 2020, 9, 12, "21:45", 2020, 9, 14, "12:47", "마드리드", "인천", 502100, "티웨이"));
			flightList.add(new Flight("LJ-334", 2020, 9, 30, "19:56", 2020, 10, 01, "05:33", "마드리드", "인천", 654900, "진에어"));
			oos.writeObject(flightList);
			oos.close();
		}
		
	}
		
		/*********************************************/
		
	public ArrayList<Flight> readFile() throws Exception{
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
	/*
	 * readAll
	 */
	
	public ArrayList<Flight> readAll() throws Exception{
		return this.readFile();
	}
	/*
	 * readOne
	 */
	 
	
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
	
	
	/*
	 * readMultiple
	 */
	
	

	
	public void update(Flight updateFlight) throws Exception {
		ArrayList<Flight> flightList = readFile();
		for (Flight flight : flightList) {
			if (flight.getFlightName().equals(updateFlight.getFlightName())) {
				flight.setFlightFinishTime(updateFlight.getFlightFinishTime());
				flight.setFlightFinishYear(updateFlight.getFlightFinishYear());
				flight.setFlightFinishMonth(updateFlight.getFlightFinishMonth());
				flight.setFlightFinishDay(updateFlight.getFlightFinishDay());
				flight.setFlightStartTime(updateFlight.getFlightStartTime());
				flight.setFlightStartYear(updateFlight.getFlightStartYear());
				flight.setFlightStartMonth(updateFlight.getFlightStartMonth());
				flight.setFlightStartDay(updateFlight.getFlightStartDay());
				 
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
