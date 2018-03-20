import java.util.*;

public class FilterVans implements Filter {

   @Override
   public List<MyVehicles> meetFilter(List<MyVehicles> vehicles) {
      List<MyVehicles> vehicleVans = new ArrayList<MyVehicles>(); 
      
      for (MyVehicles van : vehicles) {
         if(van.getVehicleType().equalsIgnoreCase("Van")){
        	 vehicleVans.add(van);
         }
      }
      return vehicleVans;
   }
}