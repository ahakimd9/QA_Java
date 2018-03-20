import java.util.*;


class Map {
	
	private static Object map[][] = new Object[10][10];
	
	
	public static void printMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] instanceof Player) {
					System.out.print("P");
				}
				
				else if (map[i][j] instanceof Treasure) {
					System.out.print("T");
				} else
				System.out.print("O");
			}
			System.out.print("\n");
		}
	}
	
	public void AddtoMap(Treasure treasure, Treasure player) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {				
				if (i==player.getPosition()[0]&&j==player.getPosition()[1]) {
					map[i][j] = player;
				}
				
				System.out.print("\n");
				if (i==treasure.getPosition()[0]&&j==treasure.getPosition()[1]) {
					map[i][j] = treasure;
				}	
			}
			
		}
	}

	public void MovePlayer(Treasure player) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Try moving in different directions by typing \"north\", \"south\", \"east\" or \"west\": ");
		int direction = input.nextInt();
		
		if ("s".equals ("/north")) {
			System.out.println("test");
		} else
			System.out.println("test123");
	}
	

}
