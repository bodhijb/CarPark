package areaPark;

import java.util.ArrayList;

import app.Controller;
import vehicle.Vehicle;

public class AreaPark {
	
	private String name;
	ArrayList<Grid> carParks;

	Controller apController;
	
	public AreaPark(String name) {
		super();
		this.name = name;
		carParks = new ArrayList<>();
	}
	
	public void addAGrid(Grid grid) {
		carParks.add(grid);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Grid> getCarParks() {
		return carParks;
	}

	public void setCarParks(ArrayList<Grid> carParks) {
		this.carParks = carParks;
	}

	public Grid retreiveGrid(String gridName) {
		for(Grid grid: carParks) {
			if(grid.getName().equals(gridName)) {
				return grid;
			}
		}
		return null;
	}

	

	
	
	

}
