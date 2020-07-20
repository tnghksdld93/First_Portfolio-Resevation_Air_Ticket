package com.itwill.flight.test;

import java.util.ArrayList;

import com.itwill.flight.Flight;
import com.itwill.flight.FlightService;

public class FlightServiceTestMain {
	public static void main(String[] args) throws Exception {
		
		FlightService fs = new FlightService();
		
		System.out.println("------------add----------------");
		boolean isAdd = fs.addFlight(new Flight("FlyAsia", "2020-07-20-19:00", "2020-07-21-12:00"));
		System.out.println(isAdd);
		boolean isAdd1 = fs.addFlight(new Flight("FlyAmerica", "2020-07-19-19:00", "2020-07-21-12:00"));
		System.out.println(isAdd1);
		boolean isAdd2 = fs.addFlight(new Flight("FlyAfrica", "2020-07-22-19:00", "2020-07-29-12:00"));
		System.out.println(isAdd2);
		boolean isAdd3 = fs.addFlight(new Flight("FlyParis", "2020-07-20-22:00", "2020-07-25-12:00"));
		System.out.println(isAdd3);
		
		System.out.println("------------readAll----------------");
		
		ArrayList<Flight> flightList = fs.findAllFlight();

		System.out.println("------------finfName----------------");
		Flight findName = new Flight();
		findName = fs.findByName("FlyParis");
		System.out.println(findName);
		
		System.out.println("------------update----------------");
		fs.updateFlight(new Flight("FlyCanada", "2020-07-29-22:00", "2020-08-05-12:00"));
		
		System.out.println("------------delete----------------");
		fs.deleteFlight("FlyAfrica");
		
		
		
		
		
		
		
	}
}
