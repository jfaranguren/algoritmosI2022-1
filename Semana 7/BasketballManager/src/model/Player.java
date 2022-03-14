package model;

public class Player {

	private String name;
	private String lastName;
	private String id;
	private int shirtNumber;

	public Player(String name, String lastName, String id, int shirtNumber) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.shirtNumber = shirtNumber;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	@Override
	public String toString() {
		return "Player info:\nId: " + id + "\nFullname: " + name + " " + lastName + "\nShirt Number: " + shirtNumber;
	}

}
