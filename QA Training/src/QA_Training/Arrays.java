package QA_Training;

public class Arrays {

	public static void main(String[] args) {
		method2(0, 2);
		iteration(0);
		arrays();
		arrays1();
		arrays2();
		
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
	
	static void arrays () {
		
	int [] a = {80,81,82,83,84,85,86,87,88,89};
		
	for (int i = 0; i < 10; i++) {
		
		method2(a[i], a[i]); 
		}
		
	}
	
	static void arrays1 () {
		
	int b[] = {80,81,82,83,84,85,86,87,88,89};
		
	  for (int i : b) {
		  
		  System.out.println("Array: " + i);
		}
	}
	
	
	static void arrays2 () {
		
	int c[] = new int[10];	
	
	  for (int i = 1; i < 10; i++) {
		  c [i] = i + 1; 
		  System.out.print(i + ", ");
		}
	  
	  	{
		  
		  System.out.print("\n");
		}
	  
	 for (int i = 1; i < 10; i++) {
		  
		  System.out.print(i*10 + ", ");
		}
	  
	}

}


	
