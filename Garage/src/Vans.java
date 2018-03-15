
class Vans extends MyVehicles {

	private boolean roofRack = true;

	Vans (int ID, String vehicleType, String vehicleName, boolean roofRack) {
		super (ID, vehicleType, vehicleName);
		this.roofRack = roofRack;
	}
	
	boolean getRoofRack () {
		return roofRack;
	}
	
	void print ()
	{	
		super.print();
		System.out.print(", Does it have a Roof Rack? " + roofRack + "\n");
	}
}