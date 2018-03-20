
class Car extends MyVehicles {

	private int passengerSeats; 
	private boolean boot = true;

	Car (int ID, String vehicleType, String vehicleName, int bill, int passengerSeats, boolean boot) {
		super (ID, vehicleType, vehicleName, bill);
		this.passengerSeats = passengerSeats;
		this.boot = boot;
	}
	
	int getSeats () {
		return passengerSeats;
	}
	
	boolean getBoot () {
		return boot;
	}
	
	void print ()
	{	
		super.print();
		System.out.print(", Number of passenger seats: " + passengerSeats + ", Is boot available? " + boot + "\n");
	}
}