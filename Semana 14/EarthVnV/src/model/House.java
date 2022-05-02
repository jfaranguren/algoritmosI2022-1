package model;

public class House extends Property {

	private int floors;

	public House(String name, String country, String city, String address, double area, int rooms, int floors) {
		super(name, country, city, address, area, rooms);
		this.floors = floors;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

}
