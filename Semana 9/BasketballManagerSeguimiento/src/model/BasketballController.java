package model;

public class BasketballController {

	private Team[] teams;

	public BasketballController() {

		teams = new Team[3];

	}

	public boolean registerTeam(String teamName, int year, int month, int day) {

		boolean stopFlag = false;

		Team myTeam = new Team(teamName, day, month, year);

		for (int i = 0; i < teams.length && !stopFlag; i++) {

			if (teams[i] == null) {

				myTeam.setId((i + 1) + "");
				teams[i] = myTeam;
				stopFlag = true;

			}

		}

		return stopFlag;

	}

	public String showTeamsList() {

		String msg = "";

		for (int i = 0; i < teams.length; i++) {

			if (teams[i] != null) {

				msg += "\n" + teams[i].getId() + ". " + teams[i].getName();
			}
		}

		return msg;

	}

	public boolean registerPlayer(String teamID, String name, String lastName, String id, int shirtNumber, int playerPosition) {

		boolean stopFlag = false;

		for (int i = 0; i < teams.length && !stopFlag; i++) {

			if (teams[i] != null) {

				if ((i + 1 + "").equals(teamID)) {

					stopFlag = teams[i].addPlayer(name, lastName, id, shirtNumber, playerPosition);

				}

			}

		}

		return stopFlag;

	}

	//Método añadido para consultar la información de todos los equipos
	
	public String showTeams() {

		String msg = "";

		for (int i = 0; i < teams.length; i++) {

			if (teams[i] != null) {

				msg += "\n" + teams[i].toString();
			}
		}

		return msg;

	}

}
