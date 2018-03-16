import java.util.*;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dial = 5;

		Position north = new Position(4, 0, 0, 0);
		Position south = new Position(0, 2, 0, 0);
		Position east = new Position(0, 0, 3, 0);
		Position west = new Position(0, 0, 0, 1);

		System.out.println("Welcome to The adventure of the Barren Moor!" + "\n");

		System.out.println("You awaken to find yourself in a barren moor.  Try to look around you by typing \"look\": ");
		String look = sc.next();

		System.out.println("Grey foggy clouds float oppressively close to you,");
		System.out.println("reflected in the murky grey water which reaches upto your shins.");
		System.out.println("Some black plants barely poke out of the shallow water." + "\n");

		System.out.println("You notice a small watch-like device in your left hand.");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time." + "\n");

		System.out.println("The dial currently reads: " + dial + "m");

		System.out.println(
				"Try moving in different directions by typing 1 for \"north\", 2 for \"south\", 3 for \"east\" or 4 for \"west\": ");
		int direction = sc.nextInt();

		{
			String gridArray[][] = new String[4][5];
			System.out.println("Your current position -");
			for (int i = 0; i < gridArray.length; i++) {
				for (int j = 0; j < gridArray[0].length; j++) {
					if (j == 0) {
						System.out.print((i + 1));
					} else if (j == 4) {
						System.out.println("X");
					} else {
						System.out.print("X");
					}
				}
			}
		}

		if (direction == 1) {

			System.out.println("The dial now reads: " + (dial + north.getNorth()));
		}

		else if (direction == 2) {
			System.out.println("The dial now reads: " + (dial - south.getSouth()));
		}

		else if (direction == 3) {
			System.out.println("The dial now reads: " + (dial + east.getEast()));
		}

		else if (direction == 4) {
			System.out.println("The dial now reads: " + (dial - west.getWest()));
		}

		while (dial != 0) {
			System.out.println("Try moving in a different direction again: ");
			int direction1 = sc.nextInt();

			if (direction1 == 1) {

				System.out.println("The dial now reads: " + (dial + north.getNorth()));
			}

			else if (direction1 == 2) {
				System.out.println("The dial now reads: " + (dial - south.getSouth()));
			}

			else if (direction1 == 3) {
				System.out.println("The dial now reads: " + (dial + east.getEast()));
			}

			else if (direction1 == 4) {
				System.out.println("The dial now reads: " + (dial - west.getWest()));
			}

		}

		if (dial == 0) {
			System.out.println("You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
		}

	}
}

// sc.close();
