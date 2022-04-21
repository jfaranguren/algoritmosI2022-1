package model;

public class Species {

	private String name;
	private String scientificName;
	private boolean isMigratory;
	private SpeciesType type;

	public Species(String name, String scientificName, boolean isMigratory, int type) {

		this.name = name;
		this.scientificName = scientificName;
		this.isMigratory = isMigratory;

		switch (type) {
		case 1:
			this.type = SpeciesType.LAND_FLORA;
			break;
		case 2:
			this.type = SpeciesType.AQUATIC_FLORA;
			break;
		case 3:
			this.type = SpeciesType.BIRD;
			break;
		case 4:
			this.type = SpeciesType.MAMMAL;
			break;
		case 5:
			this.type = SpeciesType.AQUATIC_FAUNA;
			break;

		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public boolean isMigratory() {
		return isMigratory;
	}

	public void setMigratory(boolean isMigratory) {
		this.isMigratory = isMigratory;
	}

	public SpeciesType getType() {
		return type;
	}

	public void setType(int type) {
		switch (type) {
		case 1:
			this.type = SpeciesType.LAND_FLORA;
			break;
		case 2:
			this.type = SpeciesType.AQUATIC_FLORA;
			break;
		case 3:
			this.type = SpeciesType.BIRD;
			break;
		case 4:
			this.type = SpeciesType.MAMMAL;
			break;
		case 5:
			this.type = SpeciesType.AQUATIC_FAUNA;
			break;

		}
	}

}
