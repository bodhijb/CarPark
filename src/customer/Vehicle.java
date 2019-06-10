package customer;

import app.Controller;

public class Vehicle {
	
	private String registrationNo;
	private Size size;
	private Controller vController;
	
	
	
	public Vehicle(String registrationNo, Size size) {
		super();
		this.registrationNo = registrationNo;
		this.size = size;
		vController = new Controller("vController");
	}
	

	public Vehicle( ) {
		
	}
	
	
	public enum Size {
		SMALL, MEDIUM, LARGE;
	}
	
	public int checkAvailiable(String gridName) {
		return vController.checkNoOfSpaces(gridName);
		
	}


	public String getRegistrationNo() {
		return registrationNo;
	}


	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}


	public Size getSize() {
		return size;
	}


	public void setSize(Size size) {
		this.size = size;
	}


	
	

}
