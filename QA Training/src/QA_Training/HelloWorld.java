package QA_Training;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld1();
		HelloWorld2("Hello World!2");
		System.out.println(HelloWorld3());		
	}
	
	static void HelloWorld1() {
		System.out.println ("Hello World!");
	}
	
	static void HelloWorld2(String H) {
		System.out.println (H);
	}
	
	static String HelloWorld3() {
		return "Hello World!3";
	}
}
	