
 class MyVehicles {

	private int ID; 
	private String vehicleType;
	private String vehicleName;

	MyVehicles (int ID , String vehicleType, String vehicleName) {
		this.ID = ID;
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
	}
	
	int getID () {
		return ID;
	}
	
	String getVehicleType () {
		return vehicleType;
	}
	
	String getVehicleName () {
		return vehicleName;
	}
	
	void print ()
	{
		System.out.print("ID: " + ID + ", Vehicle Type: " + vehicleType + ", Vehicle Name: " + vehicleName + " ");
	}
}