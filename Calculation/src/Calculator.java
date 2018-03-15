
public class Calculator {

	public static void main(String[] args) {

		cal(5, 3, 15);

	}

	public static void cal(int a, int b, int c) {

		int result1 = a | b | c;
		
		if (a+b == result1) {
			System.out.println(a + "+" + b + "=" + result1);
		}
		
		if (a+c == result1) {
			System.out.println(a + "+" + b + "=" + result1);
		}
		
		if (b+c == result1) {
			System.out.println(a + "+" + b + "=" + result1);
		}
		
		////////////////////////////////////////////////
		
		if (a-b == result1) {
			System.out.println(a + "-" + b + "=" + result1);
		}
		
		if (a-c == result1) {
			System.out.println(a + "-" + b + "=" + result1);
		}

		
		if (b-c == result1) {
			System.out.println(a + "-" + b + "=" + result1);
		}

		
		////////////////////////////////////////////////
		
		if (a*b == result1) {
			System.out.println(a + "x" + b + "=" + result1);

		}
		
		if (a*c == result1) {
			System.out.println(a + "x" + b + "=" + result1);
		}
		
		if (b*c == result1) {
			System.out.println(a + "x" + b + "=" + result1);
		}
		
		////////////////////////////////////////////////
		
		if (a/b == result1) {
			System.out.println(a + "/" + b + "=" + result1);
		}
		
		if (a/c == result1) {
			System.out.println(a + "/" + b + "=" + result1);
		}
		
		if (b/c == result1) {
			System.out.println(a + "/" + b + "=" + result1);
		}
		else {
			System.out.println("null");
		}
	 }
}
