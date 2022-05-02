package ui;

import java.util.Scanner;

import model.IcesiPersonnelController;

public class IcesiPersonnelManager {

	public static Scanner reader;
	public static IcesiPersonnelController personnelController;

	public static void main(String[] args) {
		init();
		showMainMenu();
	}

	private static void init() {

		reader = new Scanner(System.in);
		personnelController = new IcesiPersonnelController();
	}

	private static void showMainMenu() {

		System.out.println("Welcome to Icesi Personnel Manager");

		boolean stopFlag = false;

		while (!stopFlag) {

			System.out.println("\nType an option");
			System.out.println("1. Register an Employee");
			System.out.println("2. Calculate salary of an Employee");
			System.out.println("3. Show Employee Info");
			System.out.println("4. Sort Employees");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();

			switch (mainOption) {

			case 1:
				registerEmployee();
				break;
			case 2:
				calculateSalary();
				break;
			case 3:
				showEmployeeInfo();
				break;
			case 4:
				System.out.println("The original array was: ");
				System.out.println(personnelController.showEmployeeInfo());
				personnelController.sortEmployees();
				System.out.println("The sorted array is: ");
				System.out.println(personnelController.showEmployeeInfo());
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

	private static void registerEmployee() {

		System.out.println("Type the new Employee's name: ");
		String name = reader.nextLine();
		name = reader.nextLine();

		System.out.println("Type the new Employee's id: ");
		String id = reader.nextLine();

		System.out.println("Type the Employee's contract type?\nType:\n1. Full time\n2. Half time\n3. Service");
		int contractType = reader.nextInt();

		System.out.println("Type the Employee's starting day (YYYY-MM-DD)");
		String startingDate = reader.nextLine();
		startingDate = reader.nextLine();

		int year = Integer.parseInt(startingDate.split("-")[0]);
		int month = Integer.parseInt(startingDate.split("-")[1]);
		int day = Integer.parseInt(startingDate.split("-")[2]);

		System.out.println("Choose a Type for the new Employee:\n1. Professor\n2. Administrative");
		int type = reader.nextInt();

		if (type == 1) {

			System.out.println(
					"Type the Professor's maximum degree:\nType:\n1. PhD\n2. Master\n3. Specialization\n4. Bachelor");
			int degree = reader.nextInt();

			System.out.println("Type the Professor's number of courses?");
			int courses = reader.nextInt();

			if (personnelController.registerProfessor(name, id, contractType, year, month, day, degree, courses)) {

				System.out.println("Professor registered successfully");

			} else {

				System.out.println("Error, Professor couldn't be registered");
			}

		}

		if (type == 2) {

			System.out.println(
					"Type the Employee's position type?\nType:\n1. Director\n2. Head\n3. Coordinator\n4. Assistant\n5. Technician");
			int positionType = reader.nextInt();

			if (personnelController.registerAdministrative(name, id, contractType, year, month, day, positionType)) {

				System.out.println("Administrative Employee registered successfully");

			} else {

				System.out.println("Error, Administrative Employee couldn't be registered");
			}

		}

	}

	private static void calculateSalary() {

		System.out.println("Which Employee do you want to calculate their salary?");

		if (!personnelController.showEmployeesList().equals("")) {
			System.out.println(personnelController.showEmployeesList());

			int id = reader.nextInt() - 1;

			System.out.println(personnelController.showEmployeeInfo(id));

			if (!personnelController.showSalary(id).equals("")) {

				System.out.println("\nSalary: " + personnelController.showSalary(id));

			} else {

				System.out.println("Error, Employee's salary couldn't be calculated");
			}

		} else {
			System.out.println("There aren't any Employees registered yet");
		}

	}

	private static void showEmployeeInfo() {
		System.out.println("Which Employee do you want to be shown?");

		if (!personnelController.showEmployeesList().equals("")) {
			System.out.println(personnelController.showEmployeesList());

			int id = reader.nextInt() - 1;

			System.out.println(personnelController.showEmployeeInfo(id));

		} else {
			System.out.println("There aren't any Employees registered yet");
		}

	}

}
