package ui;

import java.util.Scanner;

import model.EarthVnVController;

public class EarthVnVManager {

	public static Scanner reader;
	public static EarthVnVController earthController;

	public static void main(String[] args) {
		init();
		showMainMenu();
	}

	private static void init() {

		reader = new Scanner(System.in);
		earthController = new EarthVnVController();
	}

	private static void showMainMenu() {

		System.out.println("Welcome to EarthVnV");

		boolean stopFlag = false;

		while (!stopFlag) {

			System.out.println("\nType an option");
			System.out.println("1. Register an User");
			System.out.println("2. Register a Property");
			System.out.println("3. Book a Property");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();

			switch (mainOption) {

			case 1:
				registerUser();
				break;
			case 2:
				registerProperty();
				break;
			case 3:
				bookProperty();
				break;
			case 0:
				System.out.println("Thanks for using our system");
				stopFlag = true;
				break;
			default:
				System.out.println("You must type a valid option");
				break;

			}

		}

	}

	private static void registerUser() {

		System.out.println("Type the new User's name: ");
		String name = reader.nextLine();
		name = reader.nextLine();

		System.out.println("Type the new User's lastname: ");
		String lastname = reader.nextLine();

		System.out.println("Type the new User's id: ");
		String id = reader.nextLine();

		System.out.println("Type the new User's e-mail: ");
		String email = reader.nextLine();

		System.out.println("Type the new User's phone number: ");
		String phone = reader.nextLine();

		System.out.println("Is the new User a Premium User? \n1. Yes\n2. No ");
		int premium = reader.nextInt();

		if (premium == 1) {
			System.out.println("Type the new User's subscripton date (YYYY-MM-DD): ");
			String subscriptionDate = reader.nextLine();
			subscriptionDate = reader.nextLine();
			int year = Integer.parseInt(subscriptionDate.split("-")[0]);
			int month = Integer.parseInt(subscriptionDate.split("-")[1]);
			int day = Integer.parseInt(subscriptionDate.split("-")[2]);

			if (earthController.registerPremiumUser(name, lastname, id, email, phone, day, month, year)) {

				System.out.println("User registered successfully");

			} else {

				System.out.println("Error, User couldn't be registered");
			}

		} else {

			if (earthController.registerUser(name, lastname, id, email, phone)) {

				System.out.println("User registered successfully");

			} else {

				System.out.println("Error, User couldn't be registered");
			}

		}
	}

	private static void registerProperty() {

		System.out.println("Type the new Property's name: ");
		String name = reader.nextLine();
		name = reader.nextLine();

		System.out.println("Type the new Property's country: ");
		String country = reader.nextLine();

		System.out.println("Type the new Property's city: ");
		String city = reader.nextLine();

		System.out.println("Type the new Property's address: ");
		String address = reader.nextLine();

		System.out.println("Type the new Property's area in m2: ");
		double area = reader.nextDouble();

		System.out.println("Type the new Property's available rooms: ");
		int rooms = reader.nextInt();

		System.out.println("Type the type of the new Property:\n1. House\n2. Apartment");
		int type = reader.nextInt();

		if (type == 1) {

			System.out.println("Type the new Property's floors: ");
			int floors = reader.nextInt();

			if (earthController.registerHouse(name, country, city, address, area, rooms, floors)) {

				System.out.println("Property registered successfully");

			} else {

				System.out.println("Error, Property couldn't be registered");
			}

		} else {
			System.out.println("Type the new Property's numeric identification: ");
			String id = reader.nextLine();
			id = reader.nextLine();

			if (earthController.registerApartment(name, country, city, address, area, rooms, id)) {

				System.out.println("Property registered successfully");

			} else {

				System.out.println("Error, Property couldn't be registered");
			}
		}

	}

	private static void bookProperty() {

		if (!earthController.showUserList().equals("") && !earthController.showPropertyList().equals("")) {

			System.out.println("Select a user to book: ");
			System.out.println(earthController.showUserList());
			int userID = reader.nextInt();

			System.out.println("Select a property to book: ");
			System.out.println(earthController.showPropertyList());
			int propertyID = reader.nextInt();

			System.out.println("Type the Booking initial date (YYYY-MM-DD): ");
			String initialDate = reader.nextLine();
			initialDate = reader.nextLine();

			int yearIni = Integer.parseInt(initialDate.split("-")[0]);
			int monthIni = Integer.parseInt(initialDate.split("-")[1]);
			int dayIni = Integer.parseInt(initialDate.split("-")[2]);

			System.out.println("Type the Booking final date (YYYY-MM-DD): ");
			String finalDate = reader.nextLine();

			int yearFin = Integer.parseInt(finalDate.split("-")[0]);
			int monthFin = Integer.parseInt(finalDate.split("-")[1]);
			int dayFin = Integer.parseInt(finalDate.split("-")[2]);

			String summary = earthController.registerBooking(userID - 1, propertyID - 1, dayIni, monthIni, yearIni,
					dayFin, monthFin, yearFin);

			if (!summary.equals("")) {

				System.out.println("Booiking registered successfully");

				System.out.println(summary);

			} else {

				System.out.println("Error, Booking couldn't be registered");
			}

		} else {

			System.out.println(
					"Error, You cannot create Bookings, either you have no users or no properties registered yet");

		}

	}

}
