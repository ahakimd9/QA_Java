
public class Goldilock {

	public static void main(String[] args) {
			
		Chair chair1 = new Chair (30, 50);
		Chair chair2 = new Chair (130, 75);
		//System.out.println(chair1.getWeight());
		
		Chair nameofarray[] = {chair1,chair2}; 
		
		for (int i = 0; i < nameofarray.length; i++) {
			System.out.println(nameofarray[i].getWeight());
			
			if (nameofarray[i].getWeight() >=100 && nameofarray[i].getTemp() <=80) {
				System.out.println("Can sit on the chair");
			} else {
				System.out.println("Can't sit on chair");
			}
		}
	}
}


		
			
			/*
			
			if(chair1>=100 && temp1<=80) {
				
				System.out.println("I can sit on chair1");
			}
			
			if(chair2>=100 && temp2<=80) {
				
				System.out.println("I can sit on chair2");
			}
			
			if(chair3>=100 && temp3<=80) {
				
				System.out.println("I can sit on chair3");
			
		}
			
			if(chair4>=100 && temp4<=80) {
				
				System.out.println("I can sit on chair4");
			
		}
			if(chair5>=100 && temp5<=80) {
				
				System.out.println("I can sit on chair5");
			
		}
			if(chair6>=100 && temp6<=80) {
				
				System.out.println("I can sit on chair6");
			
		}
			if(chair7>=100 && temp7<=80) {
				
				System.out.println("I can sit on chair7");
			
		}
		}
	

	}
		*/
		
		

	
	
	



