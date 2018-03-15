package QA_Training;

public class UniqueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function1(2, 3, 1);
	}

	static void function1(int uSum1, int uSum2, int uSum3) {

		int TotalSum = uSum1 + uSum2 + uSum3;
		
		if (uSum1 == uSum2 && uSum2 == uSum3 && uSum1 == uSum3) {
			System.out.println ("0");
		}
		
		else if (uSum1 == uSum2 && (uSum3 != uSum1 && uSum3 != uSum2) ) {
			System.out.println (uSum3);			
		}
		
		else if (uSum2 == uSum3 && (uSum1 != uSum2 && uSum1 != uSum3) ) {
			System.out.println (uSum1);			
		}
		
		else if (uSum1 == uSum3 && (uSum2 != uSum1 && uSum2 != uSum3) ) {
			System.out.println (uSum2);			
		}
		
		else if (uSum1 != uSum2 && uSum2 != uSum3 && uSum1 != uSum3) {
			System.out.println (TotalSum);			
		}
		
		
		
		
		
		
		
		
		
	}
}
