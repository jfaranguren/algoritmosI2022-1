package ui;

import java.util.Scanner;

import model.SpeciesController;

public class SpeciesManager {

	public static Scanner reader;
	public static SpeciesController speciesController;

	public static void main(String[] args) {
		init();
		showMainMenu();
	}

	private static void init() {

		reader = new Scanner(System.in);
		speciesController = new SpeciesController();
	}

	private static void showMainMenu() {

		System.out.println("Welcome to Icesi Species");

		boolean stopFlag = false;

		while (!stopFlag) {

			System.out.println("\nType an option");
			System.out.println("1. Register a Species");
			System.out.println("2. Edit a Species");
			System.out.println("3. Delete a Species");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();

			switch (mainOption) {

			case 1:
				registerSpecies();
				break;
			case 2:
				editSpecies();
				break;
			case 3:
				deleteSpecies();
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

	private static void registerSpecies() {

		System.out.println("Type the new Species' name: ");
		String name = reader.next();

		System.out.println("Type the new Species' scientific name: ");
		String scientificName = reader.next();

		boolean isMigratory = false;

		System.out.println("Is the new Species migratory?\nType:\n1.Yes\n2.No");
		int migratoryChoice = reader.nextInt();

		if (migratoryChoice == 1) {
			isMigratory = true;
		}

		System.out.println(
				"Choose a Type for the new Species:\n1.Land flora\n2.Acuatic flora\n3.Bird\n4.Mammal\n5.Aquatic fauna");
		int type = reader.nextInt();

		if (speciesController.registerSpecies(name, scientificName, isMigratory, type)) {

			System.out.println("Species registered successfully");

		} else {

			System.out.println("Error, Species couldn't be registered");
		}

	}

	private static void editSpecies() {

		System.out.println("Which Species do you want to edit?");

		if (!speciesController.showSpeciesList().equals("")) {
			System.out.println(speciesController.showSpeciesList());
			
			//...
			
			
			
		} else {
			System.out.println("There aren't any species registered yet");
		}

	}

	private static void deleteSpecies() {

		System.out.println("Which Species do you want to delete?");

		if (!speciesController.showSpeciesList().equals("")) {
			System.out.println(speciesController.showSpeciesList());
			
			//...
			
			
			
		} else {
			System.out.println("There aren't any species registered yet");
		}

	}
}
