
public class Position {
	
	private int north = 6;
	private int south = 4;
	private int east = 5;
	private int west = 3;
	
	Position (int north, int south, int east, int west){
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
	}
	
	int getNorth() {
		return north;
	}
	
	int getSouth() {
		return south;
	}
	
	int getEast() {
		return east;
	}
	
	int getWest() {
		return west;
	}

}
