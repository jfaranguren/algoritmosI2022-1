package model;

public class TaxReport {

	private String id;
	private String name;
	private String lastName;
	private double sales;
	private double income;
	private double equity;

	public TaxReport(String id, String name, String lastName, double sales, double income, double equity) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.sales = sales;
		this.income = income;
		this.equity = equity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getEquity() {
		return equity;
	}

	public void setEquity(double equity) {
		this.equity = equity;
	}

}
