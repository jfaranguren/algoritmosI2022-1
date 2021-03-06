package model;

public class TaxController {

	private Tax[] taxes;
	private TaxReport[] taxReports;

	public TaxController() {

		taxes = new Tax[3];
		taxReports = new TaxReport[10];

	}

	public boolean registerTax(String name, String description, double taxableBase, double fixedCharge,
			double variableCharge, int taxType) {

		boolean taxAdded = false;

		for (int i = 0; (i < taxes.length) && !taxAdded; i++) {
			if (taxes[i] == null) {

				if (taxType == 1) {
					taxes[i] = new FixedTax(name, description, taxableBase, fixedCharge);
				}

				if (taxType == 2) {
					taxes[i] = new VariableTax(name, description, variableCharge);
				}

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

							if (taxes[i] instanceof VariableTax) {

								VariableTax temp = (VariableTax) taxes[i];

								double taxIVA = taxReportTemp.getSales() * temp.getVariableCharge();
								taxes[i].setTotalMoneyCollected(taxes[i].getTotalMoneyCollected() + taxIVA);
								taxTotal += taxIVA;

							}

						}
					}
				}

			}

			if (taxReportTemp.getIncome() > 0) {

				for (int i = 0; i < taxes.length; i++) {

					if (taxes[i] != null) {

						if (taxes[i].getName().equals("RENT")) {

							if (taxes[i] instanceof FixedTax) {

								FixedTax temp = (FixedTax) taxes[i];

								// (income % 1000000) * 200000;
								double taxRent = (taxReportTemp.getIncome() % temp.getTaxableBase())
										* temp.getFixedCharge();
								taxes[i].setTotalMoneyCollected(taxes[i].getTotalMoneyCollected() + taxRent);
								taxTotal += taxRent;
							}
						}

					}

				}

			}

			if (taxReportTemp.getEquity() > 0) {

				for (int i = 0; i < taxes.length; i++) {

					if (taxes[i] != null) {

						if (taxes[i].getName().equals("EQUITY")) {

							if (taxes[i] instanceof FixedTax) {

								FixedTax temp = (FixedTax) taxes[i];

								// (Equity % 50000000) * 500000
								double taxEquity = (taxReportTemp.getIncome() % temp.getTaxableBase())
										* temp.getFixedCharge();
								taxes[i].setTotalMoneyCollected(taxes[i].getTotalMoneyCollected() + taxEquity);
								taxTotal += taxEquity;
							}
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

			if ((taxes[taxPosition - 1] instanceof FixedTax)) {

				FixedTax temp = (FixedTax) taxes[taxPosition - 1];

				temp.setTaxableBase(taxableBase);
				temp.setFixedCharge(fixedCharge);

				taxes[taxPosition - 1] = temp;

			} else if ((taxes[taxPosition - 1] instanceof VariableTax)) {

				VariableTax temp = (VariableTax) taxes[taxPosition - 1];

				temp.setVariableCharge(variableCharge);

				taxes[taxPosition - 1] = temp;

			}

			taxes[taxPosition - 1].setName(name);
			taxes[taxPosition - 1].setDescription(description);
			taxes[taxPosition - 1].setTotalMoneyCollected(0);

			editedFlag = true;
		}

		return editedFlag;
	}

	public boolean deleteTax(int taxPosition) {

		boolean deletedFlag = false;

		if (taxes[taxPosition - 1] != null) {

			taxes[taxPosition - 1] = null;

			deletedFlag = true;
		}

		return deletedFlag;

	}

	public String getTaxInfo(int taxPosition) {

		if (taxes[taxPosition - 1] != null) {

			return taxes[taxPosition - 1].toString();

		}
		return null;
	}

	public boolean editTax(int taxPosition, int attribute, String attributeToChange) {

		boolean editedFlag = false;

		if (taxes[taxPosition - 1] != null) {

			if (taxes[taxPosition - 1] instanceof FixedTax) {

				FixedTax temp = (FixedTax) taxes[taxPosition - 1];

				switch (attribute) {

				case 1:
					temp.setName(attributeToChange);
					break;

				case 2:
					temp.setDescription(attributeToChange);
					break;

				case 3:
					temp.setTaxableBase(Double.parseDouble(attributeToChange));
					break;

				case 4:
					temp.setFixedCharge(Double.parseDouble(attributeToChange));
					break;

				case 5:
					temp.setTotalMoneyCollected(Double.parseDouble(attributeToChange));
					break;

				}

				taxes[taxPosition - 1] = temp;
				editedFlag = true;

			} else if (taxes[taxPosition - 1] instanceof VariableTax) {

				VariableTax temp = (VariableTax) taxes[taxPosition - 1];

				switch (attribute) {

				case 1:
					temp.setName(attributeToChange);
					break;

				case 2:
					temp.setDescription(attributeToChange);
					break;

				case 3:
					temp.setVariableCharge(Double.parseDouble(attributeToChange));
					break;

				case 4:
					temp.setTotalMoneyCollected(Double.parseDouble(attributeToChange));
					break;

				}

				taxes[taxPosition - 1] = temp;
				editedFlag = true;

			}

			editedFlag = true;
		}

		return editedFlag;

	}

}
