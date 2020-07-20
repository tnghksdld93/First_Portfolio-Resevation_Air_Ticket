package com.itwill.reservation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ReservationDAO {

	private File reservesFile;
	
	public ReservationDAO() throws IOException {
		reservesFile = new File("reserves.ser");
		if (!reservesFile.exists()) {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("reseves.ser"));
			oos.writeObject(new ArrayList<Reservation>());
		}
	}

	public static void delete(int passNo) throws Exception {

		ArrayList<Reservation> reservList = readFile();
		for (int i = 0; i < reservList.size(); i++) {
			 if ( reservList.get(i).equals(passNo) ) {
				reservList.remove(passNo); 
			 }
			 writeFile(reservList);

		}

	}

	private static ArrayList<Reservation> readFile()throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("reserves.ser"));
		ArrayList<Reservation> reservList = (ArrayList<Reservation>)ois.readObject();
		ois.close();
		return reservList;
	}


	private static void writeFile(ArrayList<Reservation> reservList) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("reservs.ser"));
		oos.writeObject(reservList);
		oos.close();
	}
	
	
	
}
