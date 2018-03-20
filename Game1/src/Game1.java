
public class Game1 {

	public static void main(String[] args) {
		
		Map map = new Map();
		
		int [] position = {7,8};
		int [] playerPos = {0,0};
		Treasure treasure = new Treasure(position);
		Player player = new Player (playerPos);
		map.printMap();
		
		map.AddtoMap(treasure, player);
		map.printMap();
		
		map.MovePlayer(player);
	}

}
