package model;

public class FixedTax extends Tax {

	private double taxableBase;
	private double fixedCharge;

	public FixedTax(String name, String description, double taxableBase, double fixedCharge) {
		super(name, description);
		this.taxableBase = taxableBase;
		this.fixedCharge = fixedCharge;

	}

	public double getTaxableBase() {
		return taxableBase;
	}

	public void setTaxableBase(double taxableBase) {
		this.taxableBase = taxableBase;
	}

	public double getFixedCharge() {
		return fixedCharge;
	}

	public void setFixedCharge(double fixedCharge) {
		this.fixedCharge = fixedCharge;
	}

	@Override
	public String toString() {

		return "\n FixedTax info: \nName: + " + getName() + "\n Description: " + getDescription() + "\n TaxableBase: "
				+ taxableBase + "\n FixedCharge: " + fixedCharge;
	}

}