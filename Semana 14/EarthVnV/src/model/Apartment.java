package model;

public class Apartment extends Property {

	private String id;

	public Apartment(String name, String country, String city, String address, double area, int rooms, String id) {
		super(name, country, city, address, area, rooms);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
