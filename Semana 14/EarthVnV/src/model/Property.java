package model;

public class Property {

	private String name;
	private String country;
	private String city;
	private String address;
	private double area;
	private int rooms;

	public Property(String name, String country, String city, String address, double area, int rooms) {
		super();
		this.name = name;
		this.country = country;
		this.city = city;
		this.address = address;
		this.area = area;
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Property info: \n Name: " + name + "\n Full address: " + country + ", " + city + ", " + address
				+ "\n Area: " + area + "\n Rooms: " + rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

}
