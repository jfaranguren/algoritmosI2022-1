package model;

public class EarthVnVController {

	private User[] users;
	private Property[] properties;
	private Booking[] bookings;

	public EarthVnVController() {

		this.users = new User[10];
		this.properties = new Property[10];
		this.bookings = new Booking[10];

		users[0] = new PremiumUser("Juan", "Aranguren", "1", "jufearche@", "321", 1, 5, 2022);
		properties[0] = new House("Encanto", "Colombia", "Villa de Leyva", "Calle 4", 100, 2, 1);

	}

	public String showUserList() {

		String usersRegistered = "";

		for (int i = 0; (i < users.length); i++) {

			if (users[i] != null) {

				usersRegistered += "\n" + (i + 1) + ". ";

				usersRegistered += users[i].getName() + " - " + users[i].getLastname();

			}

		}

		return usersRegistered;

	}

	public String showPropertyList() {

		String propertiesRegistered = "";

		for (int i = 0; (i < properties.length); i++) {

			if (properties[i] != null) {

				propertiesRegistered += "\n" + (i + 1) + ". ";

				propertiesRegistered += properties[i].getName() + " - " + properties[i].getCity();

			}

		}

		return propertiesRegistered;

	}

	public boolean registerUser(String name, String lastname, String id, String email, String phone) {

		boolean userAdded = false;

		for (int i = 0; i < users.length && !userAdded; i++) {
			if (users[i] == null) {

				users[i] = new User(name, lastname, id, email, phone);

				userAdded = true;
			}

		}

		return userAdded;
	}

	public boolean registerPremiumUser(String name, String lastname, String id, String email, String phone, int day,
			int month, int year) {

		boolean userAdded = false;

		for (int i = 0; i < users.length && !userAdded; i++) {
			if (users[i] == null) {

				users[i] = new PremiumUser(name, lastname, id, email, phone, day, month, year);

				userAdded = true;
			}

		}

		return userAdded;

	}

	public boolean registerProperty(String name, String country, String city, String address, double area, int rooms) {

		boolean propertyAdded = false;

		for (int i = 0; i < properties.length && !propertyAdded; i++) {
			if (properties[i] == null) {

				properties[i] = new Property(name, country, city, address, area, rooms);

				propertyAdded = true;
			}

		}

		return propertyAdded;
	}

	public boolean registerHouse(String name, String country, String city, String address, double area, int rooms,
			int floors) {
		boolean propertyAdded = false;

		for (int i = 0; i < properties.length && !propertyAdded; i++) {
			if (properties[i] == null) {

				properties[i] = new House(name, country, city, address, area, rooms, floors);

				propertyAdded = true;
			}

		}

		return propertyAdded;
	}

	public boolean registerApartment(String name, String country, String city, String address, double area, int rooms,
			String id) {
		boolean propertyAdded = false;

		for (int i = 0; i < properties.length && !propertyAdded; i++) {
			if (properties[i] == null) {

				properties[i] = new Apartment(name, country, city, address, area, rooms, id);

				propertyAdded = true;
			}

		}

		return propertyAdded;
	}

	public String registerBooking(int userID, int propertyID, int dayIni, int monthIni, int yearIni, int dayFin,
			int monthFin, int yearFin) {

		boolean bookingAdded = false;

		String bookingSummary = "";

		for (int i = 0; i < bookings.length && !bookingAdded; i++) {
			if (bookings[i] == null) {

				bookings[i] = new Booking(properties[propertyID], users[userID], dayIni, monthIni, yearIni, dayFin,
						monthFin, yearFin);

				bookingAdded = true;

				bookingSummary = bookings[i].toString();

			}

		}

		return bookingSummary;
	}

}
