package Module_2;

import java.util.Scanner;

public class TestSportsTeamApp {
	static Team team1;
	static String choice = "y";
	static Scanner sc = new Scanner(System.in); // scanner variable to get the system inputs.

	public static void main(String[] args) {

		System.out.println("  " + "Welcome to the sports Team App" + '\n');

		while (choice.equalsIgnoreCase("y")) {

			takingValues();
			teamSummary();
			MoreTeam();

		}

		System.out.println("End of the line...");
		sc.close();// closing the scanner variable

	}

	// utility methods

	private static void MoreTeam() {
		System.out.print('\n' + "  " + "Continue? (y/n): ");
		choice = sc.next();
		System.out.println();

	}

	private static void takingValues() {

		System.out.println("  " + "Enter the Team Name: ");
		team1 = new Team(sc.next());// Assigns the team name
		System.out.println('\n' + "  " + "Enter the Players Name: ");
		System.out.println("  " + "Hint: use comma for multiple players; no space>:");
		addPlayersToList(sc.next());

	}

	public static void addPlayersToList(String in) {

		String input[] = in.split(",");
		{
			for (int i = 0; i < input.length; i++)
				team1.addPlayer(input[i]);// Adding the player names
		}

	}

	public static void teamSummary() {
		System.out.println('\n' + "  " + "--Team Summary---");

		System.out.println("  " + "Number of Players in the team:" + team1.getPlayerCount());
		System.out.println("  " + "Players of the Team:" + team1.printPlayersNames());

	}

}
