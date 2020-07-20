package com.itwill.passenger;

import java.util.ArrayList;

public class PassengerService {
	
	private PassengerDAO passengerDAO;
	public PassengerService()throws Exception{
		passengerDAO=new PassengerDAO();
	}
	
	//승객 업데이트
	public void memberUpdate(Passenger updatePassenger) throws Exception{
		passengerDAO.update(updatePassenger);
	}
	
	//승객 삭제
	public void memberDelete(String memberId) throws Exception{
		passengerDAO.delete("memberId");
		
	}
}

