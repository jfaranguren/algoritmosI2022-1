package model;

public class VariableTax extends Tax {

	private double variableCharge;

	public VariableTax(String name, String description, double variableCharge) {
		super(name, description);

		this.variableCharge = variableCharge;

	}

	public double getVariableCharge() {
		return variableCharge;
	}

	public void setVariableCharge(double variableCharge) {
		this.variableCharge = variableCharge;
	}

	@Override
	public String toString() {
		return "\n VariableTax info: \nName: + " + getName() + "\n Description: " + getDescription()
				+ "\n VariableCharge: " + variableCharge;
	}

}