import java.util.*;

public class FilterCars implements Filter {

   @Override
   public List<MyVehicles> meetFilter(List<MyVehicles> vehicles) {
      List<MyVehicles> vehicleCars = new ArrayList<MyVehicles>(); 
      
      for (MyVehicles vehicle : vehicles) {
         if(vehicle.getVehicleType().equalsIgnoreCase("Car")){
        	 vehicleCars.add(vehicle);
         }
      }
      return vehicleCars;
   }
}