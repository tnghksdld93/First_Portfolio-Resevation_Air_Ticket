package com.itwill.flight.test;

import com.itwill.flight.Flight;
import com.itwill.flight.FlightDAO;

public class FlightDAOTestMain {
	public static void main(String[] args) throws Exception{
		FlightDAO flightDAO = new FlightDAO();
		
		System.out.println("------------create----------------");
		boolean isAdd = flightDAO.create(new Flight("id-1", "2020-07-20/07:30", "2020-07-20/12:00"));
		System.out.println(isAdd);
		isAdd = flightDAO.create(new Flight("id-2", "2020-07-22/09:30", "2020-07-22/14:00"));
		System.out.println(isAdd);
		
		
		System.out.println("---------------------readAll------------------------");
		System.out.println(flightDAO.readAll());
		System.out.println("---------------------readOne------------------------");
		System.out.println(flightDAO.readOne("id-1"));
		System.out.println("---------------------update------------------------");
		
		Flight updateFlight = flightDAO.readOne("id-1");
		updateFlight.setFlightStartDate("2020-08-21/09:40");
		updateFlight.setFlightFinishDate("2020-08-21/14:10");
		flightDAO.update(updateFlight);
		System.out.println(flightDAO.readOne("id-1"));
		System.out.println("---------------------delete------------------------");
		flightDAO.delete("id-1");
		System.out.println(flightDAO.readAll());
		
		
	}
}
