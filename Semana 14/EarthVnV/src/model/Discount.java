package model;

public enum Discount {

	PREMIUM(0.10);

	final double percentage;

	public double getPercentage() {
		return percentage;
	}

	Discount(double d) {
		this.percentage = d;
	}

}
