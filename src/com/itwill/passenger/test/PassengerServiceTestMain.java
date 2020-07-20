package com.itwill.passenger.test;

import com.itwill.passenger.Passenger;
import com.itwill.passenger.PassengerService;

public class PassengerServiceTestMain {
	public static void main(String[] args) throws Exception {
			PassengerService passengerService = new PassengerService();
			System.out.println("----register----");
			boolean isSuccess = passengerService.passengerRegister(new Passenger("xxx", "xxx", "이희수", "890123", "010-2030-4050"));
			System.out.println(isSuccess);
			isSuccess = passengerService.passengerRegister(new Passenger("yyy", "yyy", "김연아", "901213", "010-3928-2037"));
			System.out.println(isSuccess);
			isSuccess = passengerService.passengerRegister(new Passenger("zzz", "zzz", "최유정", "910317", "010-6327-0646"));
			System.out.println(isSuccess);
			System.out.println("----login----");
			int loginResult=passengerService.login("xxx","xxx");
			System.out.println(loginResult);
			loginResult=passengerService.login("yyy","aaa");
			System.out.println(loginResult);
			loginResult=passengerService.login("bbb","zzz");
			System.out.println(loginResult);
			System.out.println("----update--");
			passengerService.memberUpdate(new Passenger("aaa", "aaa", "이수혁", "771021", "010-2224-9268"));
			passengerService.memberUpdate(new Passenger("bbb", "bbb", "박지윤", "910512", "010-8256-2974"));
			
			passengerService.memberDelete("bbb");
		
	
	}
}