package Module_2;

import java.util.Scanner;

public class TestSportsTeamApp {
	static Team team1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner variable to get the system inputs.
		System.out.println("  "+"Welcome to the sports Team App" + '\n');
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.println("  "+"Enter the Team Name: ");
			team1 = new Team(sc.next());//Assigns the team name
			{
				System.out.println('\n' +"  "+ "Enter the Players Name: ");
				System.out.println("  "+"Hint: use comma for multiple players; no space>:");
				String input[] = sc.next().split(",");
				{
					for (int i = 0; i < input.length; i++)
						team1.addPlayer(input[i]);//Adding the player names
				}
			}

			System.out.println('\n' + "  "+"--Team Summary---");

			System.out.println("  "+"Number of Players in the team:" + team1.getPlayerCount());
			System.out.println("  "+"Players of the Team:" + team1.printPlayersNames());

			System.out.print('\n' +"  "+ "Continue? (y/n): ");
			choice = sc.next();
			sc.close();//closing the scanner variable
			System.out.println();

		}

		System.out.println("End of the line...");

	}

}
