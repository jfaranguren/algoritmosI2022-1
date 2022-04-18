package model;

public class Tax {
	
	private String name;
	private String description;
	private double taxableBase;
	private double fixedCharge;
	private double variableCharge;
	private double totalMoneyCollected;
	
	public Tax(String name, String description, double taxableBase, double fixedCharge, double variableCharge) {
		super();
		this.name = name;
		this.description = description;
		this.taxableBase = taxableBase;
		this.fixedCharge = fixedCharge;
		this.variableCharge = variableCharge;
		this.totalMoneyCollected = 0;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public double getVariableCharge() {
		return variableCharge;
	}

	public void setVariableCharge(double variableCharge) {
		this.variableCharge = variableCharge;
	}

	public double getTotalMoneyCollected() {
		return totalMoneyCollected;
	}

	public void setTotalMoneyCollected(double totalMoneyCollected) {
		this.totalMoneyCollected = totalMoneyCollected;
	}

	@Override
	public String toString() {
		return "Tax [name=" + name + ", description=" + description + ", taxableBase=" + taxableBase + ", fixedCharge="
				+ fixedCharge + ", variableCharge=" + variableCharge + ", totalMoneyCollected=" + totalMoneyCollected
				+ "]";
	}

	
	

	
	
	
	
}