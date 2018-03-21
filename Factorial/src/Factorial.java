import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
//		Scanner myScanner = new Scanner(System.in);
//		System.out.println("Enter the number to be checked: ");
//		int number = myScanner.nextInt();

		calculateFactorial(120);

//		myScanner.close();
	}

	public static void calculateFactorial(int factorialNumber) {

		int divider = 2;

		while (factorialNumber % divider == 0) {

			factorialNumber = factorialNumber / divider;
			divider++;

		}

		if (factorialNumber == 1) {
			System.out.println("The factorial number is " + (divider - 1));
		} else {
			System.out.println("The number " + factorialNumber + " is not factorial");
		}

	}

}