
public class Garage {

	public static void main(String[] args) {
		Car mustang = new Car (1, "Car", "Mustang", 4, true);
		Car nissanGTR = new Car (2, "Car", "GTR", 2, true);
		Helicopter boeing = new Helicopter (24, "Heli", "Boeing AH-64 Apache", true);
		Vans vito = new Vans (13, "Van", "Vito", true);
		
		/*mustang.print();
		nissanGTR.print();
		boeing.print();
		vito.print();*/
		
		MyVehicles vehicles[] = {mustang, nissanGTR, boeing, vito}; 
		
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i].getID());
		}
		
	}
	
}
