import java.util.*;

public class FilterHelicopters implements Filter {

   @Override
   public List<MyVehicles> meetFilter(List<MyVehicles> vehicles) {
      List<MyVehicles> vehicleHeli = new ArrayList<MyVehicles>(); 
      
      for (MyVehicles heli : vehicles) {
         if(heli.getVehicleType().equalsIgnoreCase("Heli")){
        	 vehicleHeli.add(heli);
         }
      }
      return vehicleHeli;
   }
}