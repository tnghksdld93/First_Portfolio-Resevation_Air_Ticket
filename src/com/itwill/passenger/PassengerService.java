package com.itwill.passenger;

public class PassengerService {

	private PassengerDAO passengerDAO;
	public PassengerService() throws Exception {
		passengerDAO = new PassengerDAO();
	}
	
	/*
	 * 회원가입
	 */
	
	public boolean passengerRegister(Passenger addPassenger) throws Exception{
		boolean isSuccess = false;
		isSuccess = passengerDAO.create(addPassenger);
		return isSuccess;
	}
	
	/*
	 * 로그인
	 */
	public int login (String id, String password) throws Exception {
		int result = -99;
		/*
		 * 0 : 성공
		 * 1 : 아이디 존재안함
		 * 2 : 비번틀림
		 */
		if (passengerDAO.isDuplicateId(id)) {
			Passenger findPassenger = passengerDAO.readOne(id);
			if (findPassenger.matchPassword(password)) {
				result = 0;
			}else {
				result = 2;
			}
		}else {
			result = 1;
		}
		return result;
	}
	
	/*
	 * 회원정보수정
	 */
	public void passengerUpdate(Passenger updatePassenger) throws Exception {
		passengerDAO.update(updatePassenger);
		
	}
	
	/*
	 * 탈퇴
	 */
	public void PassengerUnRegister(String id) throws Exception {
		passengerDAO.delete(id);
	}
	
	
	
}
