package ui;

import java.util.Scanner;

import model.TaxController;

public class TaxManager {

	private static Scanner reader;
	private static TaxController taxControl;

	public static void main(String[] args) {

		init();
		showMenu();

	}

	public static void init() {

		reader = new Scanner(System.in);
		taxControl = new TaxController();

	}

	public static void showMenu() {

		System.out.println("Welcome to Azerim Taxes");

		boolean stopFlag = false;

		do {

			System.out.println("\nType an option");
			System.out.println("1. Register a Tax");
			System.out.println("2. Edit a Tax");
			System.out.println("3. Register a Tax Report");
			System.out.println("4. Calculate total kingdom taxes");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();

			switch (mainOption) {

			case 1:
				registerTax();
				break;
			case 2:
				editTax();
				break;
			case 3:
				registerTaxReport();
				break;
			case 4:
				showKingdomTaxes();
				break;
			case 0:
				System.out.println("Thanks for using our system");
				stopFlag = true;
				break;
			default:
				System.out.println("You must type a valid option");
				break;

			}

		} while (!stopFlag);

	}

	private static void registerTax() {

		System.out.println("Select the new Tax name:");
		String name = reader.nextLine();

		System.out.println("Type the new Tax description: ");
		String description = reader.nextLine();
		description = reader.nextLine();

		System.out.println("Type the new Tax taxable base: ");
		double taxableBase = reader.nextDouble();

		System.out.println("Type the new Tax fixed charge: ");
		double fixedCharge = reader.nextDouble();

		System.out.println("Type the new Tax variable charge: ");
		double variableCharge = reader.nextDouble();

		if (taxControl.registerTax(name, description, taxableBase, fixedCharge, variableCharge)) {

			System.out.println("Tax registered successfully");

		} else {

			System.out.println("Error, Tax couldn't be created");
		}

	}

	private static void editTax() {

		if (!taxControl.getTaxesList().equals("")) {
			System.out.println(taxControl.getTaxesList());
			
			System.out.println("Select the Tax you want to edit");
			int taxPosition = reader.nextInt();
			
			System.out.println("Select the new Tax name:");
			String name = reader.nextLine();

			System.out.println("Type the new Tax description: ");
			String description = reader.nextLine();
			description = reader.nextLine();

			System.out.println("Type the new Tax taxable base: ");
			double taxableBase = reader.nextDouble();

			System.out.println("Type the new Tax fixed charge: ");
			double fixedCharge = reader.nextDouble();

			System.out.println("Type the new Tax variable charge: ");
			double variableCharge = reader.nextDouble();

			if (taxControl.editTax(taxPosition, name, description, taxableBase, fixedCharge, variableCharge)) {

				System.out.println("Tax edited successfully");

			} else {

				System.out.println("Error, Tax couldn't be edited");
			}
		} else {
			System.out.println("There aren't any taxes registered");
		}

	}

	private static void registerTaxReport() {

		System.out.println("Type the contributor's ID: ");
		String id = reader.nextLine();
		id = reader.nextLine();

		System.out.println("Type the contributor's name: ");
		String name = reader.nextLine();

		System.out.println("Type the contributor's lastname: ");
		String lastname = reader.nextLine();

		System.out.println("Type the contributor's last year sales: ");
		double sales = reader.nextDouble();

		System.out.println("Type the contributor's last year income: ");
		double income = reader.nextDouble();

		System.out.println("Type the contributor's last year equity: ");
		double equity = reader.nextDouble();

		if (taxControl.registerTaxReport(id, name, lastname, sales, income, equity)) {

			System.out.println("Tax report registered successfully");

			System.out.println(name + " " + lastname + " must pay: " + taxControl.calculateTaxDeclaration(id));

		} else {

			System.out.println("Error, Tax report couldn't be created");
		}

	}

	private static void showKingdomTaxes() {

		System.out.println(taxControl.calculateKingdomTaxes());

	}

}
