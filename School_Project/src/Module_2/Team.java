package Module_2;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Additional modifications by A. Student 2021
*/ 

public class Team {
	// variables
	private String teamName = null;
	private int playerCount;
	private String[] players = new String[20];
	
	//constructor that accepts the team name 

	public Team(String teamName) {
		this.teamName = teamName;

	}
	
	//method to add the players to the list and increasing the count of the players

	public void addPlayer(String name) {
		if (name != null && (playerCount < players.length)) {

			players[playerCount] = name;
			playerCount++;

		}

	}
	
	//return players
	public String[] getPlayers() {
		return players;
	}
	
	//returns the player count
	public int getPlayerCount() {
		return playerCount;
	}

	//returns the team name
	public String getTeamName() {
		return teamName;
	}

	//prints the player name with the comma in between
	public String printPlayersNames() {
		String nameString = "";
		for (int i = 0; i < playerCount; i++) {
			if (i > 0) {
				nameString += ",";
			}
			nameString += players[i] + " ";
		}

		return nameString;
	}

}
