package areaPark;

public class Grid {
	private String name;
	private Space[][] park;
	private AreaPark areaPark;
	
	
	
	public enum Space {
		SMALL(), MEDIUM, LARGE;
		
		private boolean available;
		
		Space() {
			available = true;			
		}
		
				
		public String toString( ) {
			if(available) {
			return "|" + this.name() + "-" + "Available" + "| ";
			} else {
				return "|" + this.name() + "-" + "Occupied" + "| ";
			}
		}


		public boolean isAvailable() {
			return available;
		}


		public void setAvailable(boolean available) {
			this.available = available;
		}	
		
	}
	
	
	public Grid(String name, int levels, int units) {
		this.name = name;
		park = new Space[levels][units];
		areaPark = new AreaPark("areaPark");
	}
	
	public Grid() {
		
	}
	
	
	public void buildPark(int numberSmall) {
		int length = park.length;
		int spaces = park[0].length;
		int s = 0;
		
		if(numberSmall < spaces) {
			for(int i = 0; i < length; i++) {
				for(int j = 0; j < spaces; j++) {
					while(s++ < numberSmall) {
						park[i][j++] = Space.SMALL;						
					}
					park[i][j] = Space.MEDIUM;
				}
			}
		}
		else {
			for(int i = 0; i < length ; i++) {
				for(int j = 0; j < spaces; j++) {
					if(s++ < numberSmall) {
						park[i][j] = Space.SMALL;
					}
					else {
						park[i][j] = Space.MEDIUM;
					}
				}				
			}			
		}
		printPark();
	}
	
	public void printPark() {
		System.out.println(this.getName());
		for(int i = 0; i < park.length; i++) {
			for(int j = 0; j < park[0].length; j++) {
				System.out.print(park[i][j].toString() + " ");
			}
			System.out.println();
		}
	}
	
	public void updateSpace(int level, int unit) {
		Space space = park[level][unit];
		if(!space.isAvailable()) {
			space.setAvailable(true);
		} else {
			space.setAvailable(false);
		}
		
	}
	
	public int noOfFreeSpaces() {
		int count = 0;
		for(int i = 0; i < park.length; i++) {
			for(int j = 0; j < park[i].length; j++) {
				if(park[i][j].isAvailable()) {
					count++;
				}
			}
		}
		return count;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Space[][] getPark() {
		return park;
	}

	public void setPark(Space[][] park) {
		this.park = park;
	}
	
	
	
	

}
