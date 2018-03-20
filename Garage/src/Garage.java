import java.util.*;

public class Garage {

	public static void main(String[] args) {
		
		List<MyVehicles> vehicles = new ArrayList<MyVehicles>();
		
		vehicles.add(new MyVehicles (1, "Car", "Mustang", 15));
		vehicles.add(new MyVehicles (2, "Car", "Nissan GTR", 20));
		vehicles.add(new MyVehicles (3, "Car", "Jaguar XJ", 13));
		vehicles.add(new MyVehicles (24, "Heli", "Boeing AH-64 Apache", 35));
		vehicles.add(new MyVehicles (13, "Van", "Vito", 9));
		vehicles.add(new MyVehicles (14, "Van", "Ford Transit", 8));

		Filter car = new FilterCars();
		Filter heli = new FilterHelicopters();
		Filter van = new FilterVans();
		//Filter CarVan = new AndFilter(car, van);
		
		System.out.println("Cars: ");
	    printVehicles(car.meetFilter(vehicles));
	    
		System.out.println("Helicopters: ");
	    printVehicles(heli.meetFilter(vehicles));
		
		System.out.println("Vans: ");
	    printVehicles(van.meetFilter(vehicles));
	}
	    public static void printVehicles(List<MyVehicles> vehicles){
	    	   
	        for (MyVehicles vehicle : vehicles) {
	           System.out.println("[ID: " + vehicle.getID() + ", Type: " + vehicle.getVehicleType() + ", Name: " + vehicle.getVehicleName() + ", Bill: " + vehicle.getBill() + "]");
	        
	     }      
	  }
}