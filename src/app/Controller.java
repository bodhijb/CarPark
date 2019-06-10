package app;

import java.util.ArrayList;
import areaPark.AreaPark;
import areaPark.Grid;
import vehicle.Vehicle;


public class Controller {
	
	private String name;
	private AreaPark areaP;
	private Vehicle vehicle;
	private Grid grid;
	ArrayList<Vehicle> members;
	
	public Controller(String name) {
		this.name = name;
		areaP = new AreaPark("controllerAp");
		vehicle = new Vehicle();
		grid = new Grid();
	}	
	

	
	
	public static void main(String[] args) {
		
		System.out.println("Car park free");
		Grid grid = new Grid("North St Car Park", 3, 6);
		// build the car park
		grid.buildPark(5);
		
		// create 4 vehicles
	
		
		
		
		
		
	}
	
	//=====================================================
	
	
	public ArrayList<Vehicle> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Vehicle> members) {
		this.members = members;
	}


	public int checkNoOfSpaces(String gridName) {
		Grid checkThisGrid = areaP.retreiveGrid(gridName);
		return checkThisGrid.noOfFreeSpaces();
		
	}
	
	
	public void enterCarPark(String gridName, Vehicle veh) {
		if(checkNoOfSpaces(gridName) == 0) {
			return;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
