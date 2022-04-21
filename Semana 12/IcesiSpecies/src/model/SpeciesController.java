package model;

public class SpeciesController {

	private Species[] species;

	public SpeciesController() {

		this.species = new Species[80];

	}

	public boolean registerSpecies(String name, String scientificName, boolean isMigratory, int type) {

		boolean speciesAdded = false;

		for (int i = 0; i < species.length && !speciesAdded; i++) {
			if (species[i] == null) {

				species[i] = new Species(name, scientificName, isMigratory, type);
				speciesAdded = true;
			}

		}

		return speciesAdded;

	}

	public String showSpeciesInfo() {

		String msg = "";

		for (int i = 0; i < species.length; i++) {

			if (species[i] != null) {

				msg += species[i].toString();

			}

		}
		return msg;

	}

	public String showSpeciesList() {

		String wetlandsRegistered = "";

		for (int i = 0; (i < species.length); i++) {

			if (species[i] != null) {

				wetlandsRegistered += "\n" + (i + 1) + ". " + species[i].getName();
			}

		}

		return wetlandsRegistered;

	}

}
