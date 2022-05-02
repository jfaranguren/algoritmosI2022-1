package model;

public enum Degree {
	PHD(160000), MASTER(80000), SPECIALIZATION(40000), BACHELOR(20000);

	private final double RATE;

	Degree(double rate) {
		this.RATE = rate;
	}

	public double getRate() {
		return RATE;
	}

}
