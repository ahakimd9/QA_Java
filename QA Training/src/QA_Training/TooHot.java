package QA_Training;

public class TooHot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	functions2(45, true);
	
	}

	static void functions2 (int temp, boolean isSummer) {
		
		if (temp >= 60) {
			System.out.println (isSummer);
		}
		
		else if (temp <= 59) {
			System.out.println (!isSummer);
		}
		
	}
}