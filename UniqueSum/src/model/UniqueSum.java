package model;

public class UniqueSum {

	public static void main(String[] args) {
		function1(2, 3, 1);
	}

	public static int function1(int uSum1, int uSum2, int uSum3) {

		int TotalSum = uSum1 + uSum2 + uSum3;
		
		if (uSum1 == uSum2 && uSum2 == uSum3 && uSum1 == uSum3) {
			System.out.println ("0");
			return 0;
		}
		
		else if (uSum1 == uSum2 && (uSum3 != uSum1 && uSum3 != uSum2) ) {
			System.out.println (uSum3);	
			return uSum3;
		}
		
		else if (uSum2 == uSum3 && (uSum1 != uSum2 && uSum1 != uSum3) ) {
			System.out.println (uSum1);	
			return uSum1;
		}
		
		else if (uSum1 == uSum3 && (uSum2 != uSum1 && uSum2 != uSum3) ) {
			System.out.println (uSum2);
			return uSum2;
		}
		
		else if (uSum1 != uSum2 && uSum2 != uSum3 && uSum1 != uSum3) {
			System.out.println (TotalSum);
			return TotalSum;
		}
		return 0;		
		
	}
}

