package model;

public class Team {

	private String name;
	private Date foundationDate;
	private Coach coach;
	private Player[] players;

	public Team(String name, int day, int month, int year) {

		this.name = name;
		this.foundationDate = new Date(day, month, year);
		players = new Player[5];

	}

	public boolean addCoach(String name, String lastName, String id, int yearsOfExperience) {

		boolean coachAdded = false;

		if (this.coach == null) {
			this.coach = new Coach(name, lastName, id, yearsOfExperience);
			coachAdded = true;
		}

		return coachAdded;

	}

	public boolean addPlayer(String name, String lastName, String id, int shirtNumber, int positionID) {

		boolean playerAdded = false;

		for (int i = 0; (i < players.length) && !playerAdded; i++) {
			if (players[i] == null) {
				players[i] = new Player(name, lastName, id, shirtNumber);
				playerAdded = true;
			}
		}

		return playerAdded;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public void setFoundationDate(int day, int month, int year) {
		this.foundationDate = new Date(day, month, year);
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team info:\nName: " + name + "\n FoundationDate: " + foundationDate;
	}

}
