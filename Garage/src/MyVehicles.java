
 class MyVehicles {

	private int ID; 
	private String vehicleType;
	private String vehicleName;
	private int bill;

	MyVehicles (int ID , String vehicleType, String vehicleName, int bill) {
		this.ID = ID;
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
		this.bill = bill;
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
	
	int getBill () {
		return bill;
	}
	
	void print ()
	{
		System.out.print("ID: " + ID + ", Vehicle Type: " + vehicleType + ", Vehicle Name: " + vehicleName + ", Bill for this Vehicle is: " + bill + " ");
	}
}