package QA_Training;

public class BlackJack {

	public static void main(String[] args) {
	
		function(20,24);
		
	}
		
		static void function(int card1, int card2) {
			
			if (card1 >= 22 && card2 >= 22) {
				System.out.println ("0");				
			}
			else if (card1 < 0 && card2 < 0) {
				System.out.println ("0");				
			}	
			else if (card1 < 0 && card2 > 0) {
				System.out.println (card2);				
			}
			else if (card2 < 0 && card1 > 0) {
				System.out.println (card1);				
			}
			else if (card1 < 22 && card1 > card2) {
				System.out.println (card1);
			}
			else if (card2 > card1 && card2 < 22){
				System.out.println (card2);
			}
			else if (card1 >= 22) {
				System.out.println (card2);				
			}
			else if (card2 >= 22) {
				System.out.println (card1);				
			}
		}
}


