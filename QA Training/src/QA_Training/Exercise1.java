package QA_Training;

public class Exercise1 {

	public static void main(String[] args) {
		addition(45, 47);
		method1(2, 3, true);
		method2(0, 2);
		iteration(0);
		
	}
	
	static void addition(int n1, int n2) {
		int n3 = n1 + n2;
		
		System.out.println (n3);
		
		}
	
	static void method1(int n4, int n5, boolean b) {
		int n6 = n4 + n5;
		int n7 = n5 * n5 ;
		
		if (b == true) {
		System.out.println (n6);
		}
		
		else if (b == false) {
			System.out.println (n7);
		}
		
	}
	
	static void method2(int n8, int n9) {
		
		if (n8 == 0) {
		System.out.println (n9);
		}
		
		else {
		System.out.println (n8);
		}
		
	}
	
	static void iteration(int n10) {
		
	for (int i = 0; i < 10; i++) 
		  {
		method2(i, n10);

		  }
	
	}
	
}


	
