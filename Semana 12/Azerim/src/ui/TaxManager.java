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
			System.out.println("3. Delete a Tax");
			System.out.println("4. Register a Tax Report");
			System.out.println("5. Calculate total kingdom taxes");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();

			switch (mainOption) {

			case 1:
				registerTax();
				break;
			case 2:

				System.out.println("\nType an option");
				System.out.println("1. Edit a Tax completely");
				System.out.println("2. Edit an attribute of a Tax");
				int secondaryOption = reader.nextInt();

				switch (secondaryOption) {

				case 1:
					editTax();
					break;
				case 2:
					editAttributesTax();
					break;
				}

				break;
			case 3:
				deleteTax();
				break;
			case 4:
				registerTaxReport();
				break;
			case 5:
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
		name = reader.nextLine();

		System.out.println("Type the new Tax description: ");
		String description = reader.nextLine();
		
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

	private static void editAttributesTax() {

		if (!taxControl.getTaxesList().equals("")) {
			System.out.println(taxControl.getTaxesList());

			System.out.println("Select the Tax you want to edit");
			int taxPosition = reader.nextInt();

			System.out.println(taxControl.getTaxInfo(taxPosition));

			System.out.println(
					"Select the attribute you want to edit: \n1. Name\n2. Description\n3. Taxable base\n4. Fixed charge\n5. Variable charge\n6. Money collected");
			int attribute = reader.nextInt();

			String attributeToChange = "";

			switch (attribute) {

			case 1:

				System.out.println("Select the new Tax name:");
				attributeToChange = reader.nextLine();
				attributeToChange = reader.nextLine();

				break;

			case 2:

				System.out.println("Type the new Tax description: ");
				attributeToChange = reader.nextLine();
				attributeToChange = reader.nextLine();

				break;

			case 3:

				System.out.println("Type the new Tax taxable base: ");
				attributeToChange = reader.nextLine();
				attributeToChange = reader.nextLine();

				break;

			case 4:

				System.out.println("Type the new Tax fixed charge: ");
				attributeToChange = reader.nextLine();
				attributeToChange = reader.nextLine();

				break;

			case 5:

				System.out.println("Type the new Tax variable charge: ");
				attributeToChange = reader.nextLine();
				attributeToChange = reader.nextLine();

				break;

			case 6:

				System.out.println("Type the new Tax money collected: ");
				attributeToChange = reader.nextLine();
				attributeToChange = reader.nextLine();

				break;

			}

			if (taxControl.editTax(taxPosition, attribute, attributeToChange)) {

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

	private static void deleteTax() {

		if (!taxControl.getTaxesList().equals("")) {
			System.out.println(taxControl.getTaxesList());

			System.out.println("Select the Tax you want to delete");
			int taxPosition = reader.nextInt();

			if (taxControl.deleteTax(taxPosition)) {

				System.out.println("Tax deleted successfully");

			} else {

				System.out.println("Error, Tax couldn't be deleted");
			}
		} else {
			System.out.println("There aren't any taxes registered");
		}

	}

}
