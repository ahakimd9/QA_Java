
class Helicopter extends MyVehicles {

	private boolean canFly = true;

	Helicopter (int ID, String vehicleType, String vehicleName, boolean canFly) {
		super (ID, vehicleType, vehicleName);
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