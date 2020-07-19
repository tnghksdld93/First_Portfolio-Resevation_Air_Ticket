package com.itwill.passenger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PassengerDAO {
	private File passengerFile;

	public PassengerDAO() throws Exception {
		passengerFile = new File("passenger.ser");
		if (!passengerFile.exists()) {
			System.out.println("파일생성[passenger.ser]");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(passengerFile));
			oos.writeObject(new ArrayList<Passenger>());
		}
	}

	/**********************************************/
	private ArrayList<Passenger> readFile() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(passengerFile));
		ArrayList<Passenger> passengerList = (ArrayList<Passenger>) ois.readObject();
		ois.close();
		return passengerList;
	}

	private void writeFile(ArrayList<Passenger> passengerList) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(passengerFile));
		oos.writeObject(passengerList);
		oos.close();
	}
	
	/****************UPDATE******************/
	public void update(Passenger updatePassenger) throws Exception {
		ArrayList<Passenger> passengerList = this.readFile();
		for (Passenger passenger : passengerList) {
			if(passenger.getMemberId().equals(updatePassenger.getMemberId())) {
				passenger.setMemberName(updatePassenger.getMemberName());
				passenger.setNewPw(updatePassenger.getMemberPw());
				passenger.setBirthDate(updatePassenger.getBirthDate());
				passenger.setPhoneNo(updatePassenger.getPhoneNo());
			
				
				break;
			}
		}
		}

}
