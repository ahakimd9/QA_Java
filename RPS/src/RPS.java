
// Rock-Paper-Scissor Game
import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {

		String player; // Human move
		String comp = ""; // Computer move
		int randNum;
		int playerWins = 0;
		int compWins = 0;
		int ties = 0;

		System.out.println("The Rock-Paper-Scissor Game!");
		System.out.println("Player, choose your move by typing 'R' for Rock, 'P' for Paper and 'S' for Scissors");

		for (int i = 0; i < 3 ; i++) {

			Scanner input = new Scanner(System.in);
			Random random = new Random();

			randNum = random.nextInt(5);

			if (randNum == 0) {
				comp = "R";
			} else if (randNum == 1) {
				comp = "S";
			} else if (randNum == 2) {
				comp = "P";
			} else if (randNum == 3) {
				comp = "L";
			} else if (randNum == 4) {
				comp = "SP";
			}

			System.out.println("Start now. Pick your Move!");
			player = input.next();

			System.out.println("Computer's play is " + comp);

			if (player.equals(comp)) {
				System.out.println("Tie!");
				ties++;
			} else if (player.equals("R") && comp.equals("S")) {
				System.out.println("You win!");
				playerWins++;
			} else if (player.equals("R") && comp.equals("P")) {
				System.out.println("You lose!");
				compWins++;
			} else if (player.equals("R") && comp.equals("L")) {
				System.out.println("You win!");
				playerWins++;
			} else if (player.equals("R") && comp.equals("SP")) {
				System.out.println("You lose!");
				compWins++;
			} else if (player.equals("S") && comp.equals("R")) {
				System.out.println("You lose!");
				compWins++;
			} else if (player.equals("S") && comp.equals("P")) {
				System.out.println("You win!");
				playerWins++;
			} else if (player.equals("S") && comp.equals("L")) {
				System.out.println("You win!");
				playerWins++;
			} else if (player.equals("S") && comp.equals("SP")) {
				System.out.println("You lose!");
				compWins++;
			} else if (player.equals("P") && comp.equals("R")) {
				System.out.println("You win!");
				playerWins++;
			} else if (player.equals("P") && comp.equals("S")) {
				System.out.println("You lose!");
				compWins++;
			} else if (player.equals("P") && comp.equals("L")) {
				System.out.println("You lose!");
				compWins++;
			} else if (player.equals("P") && comp.equals("SP")) {
				System.out.println("You win!");
				playerWins++;
			} else
				System.out.println("You lose");

			System.out.println("Total number of player wins: " + playerWins);
			System.out.println("Total number of comp wins: " + compWins);
			System.out.println("Total number of ties: " + ties);
			System.out.println("Total number of games played: " + (i + 1));
		}
	}
}
