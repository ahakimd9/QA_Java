package model;
public class BlackJack {

	public static void main(String[] args) {
	
		function(21,22);
		
	}
		
		public static int function(int card1, int card2) {
			
			if (card1 >= 22 && card2 >= 22) {
				//System.out.println ("0");
				return 0;
			}
			else if (card1 < 0 && card2 < 0) {
				//System.out.println ("0");		
				return 0;
			}	
			else if (card1 < 0 && card2 > 0) {
				//System.out.println (card2);
				return card2;
			}
			else if (card2 < 0 && card1 > 0) {
				//System.out.println (card1);
				return card1;
			}
			else if (card1 < 22 && card1 > card2) {
				//System.out.println (card1);
				return card1;
			}
			else if (card2 > card1 && card2 < 22){
				//System.out.println (card2);
				return card2;
			}
			else if (card1 >= 22) {
				//System.out.println (card2);
				return card2;
			}
			else if (card2 >= 22) {
				//System.out.println (card1);
				return card1;
			}
			return 0;
		}
}


/*
class BlackJackTest {

@Test
public void functionTest() {
	
	BlackJack bj = new BlackJack();
	assertEquals(0, bj.function(22,22));
}
}
*/