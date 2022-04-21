package model;

public abstract class Tax {

	private String name;
	private String description;
	private double totalMoneyCollected;

	public Tax(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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

	public double getTotalMoneyCollected() {
		return totalMoneyCollected;
	}

	public void setTotalMoneyCollected(double totalMoneyCollected) {
		this.totalMoneyCollected = totalMoneyCollected;
	}

	@Override
	public abstract String toString();
	
	
	

}