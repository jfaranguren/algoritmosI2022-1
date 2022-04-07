package model;

public class TaxController {

	private Tax[] taxes;
	private TaxReport[] taxReports;

	public TaxController() {

		taxes = new Tax[3];
		taxReports = new TaxReport[10];

	}

	public boolean registerTax(String name, String description, double taxableBase, double fixedCharge,
			double variableCharge) {

		boolean taxAdded = false;

		for (int i = 0; (i < taxes.length) && !taxAdded; i++) {
			if (taxes[i] == null) {
				taxes[i] = new Tax(name, description, taxableBase, fixedCharge, variableCharge);
				taxAdded = true;
			}
		}

		return taxAdded;

	}

	public String getTaxesList() {

		String taxesRegistered = "";

		boolean taxNullFlag = false;

		for (int i = 0; (i < taxes.length) && !taxNullFlag; i++) {

			if (taxes[i] == null) {
				taxNullFlag = true;
			} else {
				taxesRegistered += "\n" + (i + 1) + ". " + taxes[i].getName() + ": " + taxes[i].getDescription();
			}

		}

		return taxesRegistered;

	}

	public boolean registerTaxReport(String id, String name, String lastname, double sales, double income,
			double equity) {

		boolean taxReportAdded = false;

		for (int i = 0; (i < taxReports.length) && !taxReportAdded; i++) {
			if (taxReports[i] == null) {
				taxReports[i] = new TaxReport(id, name, lastname, sales, income, equity);
				taxReportAdded = true;
			}
		}

		return taxReportAdded;

	}

	public double calculateTaxDeclaration(String id) {

		double taxTotal = 0;

		TaxReport taxReportTemp = null;

		boolean taxReportFlag = false;

		for (int i = 0; (i < taxReports.length) && !taxReportFlag; i++) {

			if (taxReports[i] != null) {

				if (taxReports[i].getId().equals(id)) {
					taxReportTemp = taxReports[i];
				}

			} else {
				taxReportFlag = true;
			}

		}

		if (taxReportTemp != null) {

			if (taxReportTemp.getSales() > 0) {

				for (int i = 0; i < taxes.length; i++) {

					if (taxes[i] != null) {

						if (taxes[i].getName().equals("IVA")) {
							// sales * 0.10
							double taxIVA = taxReportTemp.getSales() * taxes[i].getVariableCharge();
							taxes[i].setTotalMoneyCollected(taxes[i].getTotalMoneyCollected() + taxIVA);
							taxTotal += taxIVA;
						}
					}
				}

			}

			if (taxReportTemp.getIncome() > 0) {

				for (int i = 0; i < taxes.length; i++) {

					if (taxes[i] != null) {

						if (taxes[i].getName().equals("RENT")) {

							// (income % 1000000) * 200000;
							double taxRent = (taxReportTemp.getIncome() % taxes[i].getTaxableBase())
									* taxes[i].getFixedCharge();
							taxes[i].setTotalMoneyCollected(taxes[i].getTotalMoneyCollected() + taxRent);
							taxTotal += taxRent;
						}
					}

				}

			}

			if (taxReportTemp.getEquity() > 0) {

				for (int i = 0; i < taxes.length; i++) {

					if (taxes[i] != null) {

						if (taxes[i].getName().equals("EQUITY")) {

							// (Equity % 50000000) * 500000
							double taxEquity = (taxReportTemp.getEquity() % taxes[i].getTaxableBase())
									* taxes[i].getFixedCharge();
							taxes[i].setTotalMoneyCollected(taxes[i].getTotalMoneyCollected() + taxEquity);
							taxTotal += taxEquity;

						}
					}

				}

			}
		}
		return taxTotal;

	}

	public String calculateKingdomTaxes() {

		String kingdomTaxes = "";

		double taxIVA = 0;
		double taxRent = 0;
		double taxEquity = 0;

		for (int i = 0; (i < taxReports.length); i++) {

			for (int j = 0; j < taxes.length; j++) {

				if (taxReports[i] != null) {

					if (taxes[j] != null) {

						if (taxes[j].getName().equals("IVA")) {

							taxIVA += taxes[j].getTotalMoneyCollected();

						}

						if (taxes[j].getName().equals("RENT")) {

							taxRent += taxes[j].getTotalMoneyCollected();

						}

						if (taxes[j].getName().equals("EQUITY")) {

							taxEquity += taxes[j].getTotalMoneyCollected();

						}
					}
				}

			}

		}

		kingdomTaxes += "\nThe Kingdom Collected Taxes are as follows: ";
		kingdomTaxes += "\n IVA: " + taxIVA;
		kingdomTaxes += "\n Rent: " + taxRent;
		kingdomTaxes += "\n Equity: " + taxEquity;
		kingdomTaxes += "\n\n Total collected: " + (taxIVA + taxRent + taxEquity);

		return kingdomTaxes;
	}

	public boolean editTax(int taxPosition, String name, String description, double taxableBase, double fixedCharge,
			double variableCharge) {

		boolean editedFlag = false;

		if (taxes[taxPosition - 1] != null) {

			taxes[taxPosition - 1].setName(name);
			taxes[taxPosition - 1].setDescription(description);
			taxes[taxPosition - 1].setTaxableBase(taxableBase);
			taxes[taxPosition - 1].setFixedCharge(fixedCharge);
			taxes[taxPosition - 1].setVariableCharge(variableCharge);
			taxes[taxPosition - 1].setTotalMoneyCollected(0);

			editedFlag = true;
		}

		return editedFlag;
	}

}
