
class Helicopter extends MyVehicles {

	private boolean canFly = true;

	Helicopter (int ID, String vehicleType, String vehicleName, int bill, boolean canFly) {
		super (ID, vehicleType, vehicleName, bill);
		this.canFly = canFly;
	}
	
	boolean getCanFly () {
		return canFly;
	}
	
	void print ()
	{	
		super.print();
		System.out.print(", Can it fly? " + canFly + "\n");
	}
}