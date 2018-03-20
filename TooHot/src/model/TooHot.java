package model;
public class TooHot {

	public static void main(String[] args) {
		functions2(45, true);
	}

	public static boolean functions2(int temp, boolean isSummer) {
		
		if (temp >= 60 && isSummer == true) {
			System.out.println (isSummer);
			return isSummer;
		}
		
		else if (temp <= 59 && isSummer == false) {
			System.out.println (!isSummer);
			return !isSummer;
		}
		return isSummer;
	}
}
