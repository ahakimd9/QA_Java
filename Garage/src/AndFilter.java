import java.util.*;

public class AndFilter implements Filter {

   private Filter filter;
   private Filter otherFilter;

   public AndFilter(Filter criteria, Filter otherCriteria) {
      this.filter = criteria;
      this.otherFilter = otherCriteria; 
   }

   @Override
   public List<MyVehicles> meetFilter(List<MyVehicles> vehicles) {
   
      List<MyVehicles> firstFilterMyVehicles = filter.meetFilter(vehicles);		
      return otherFilter.meetFilter(firstFilterMyVehicles);
   }
}