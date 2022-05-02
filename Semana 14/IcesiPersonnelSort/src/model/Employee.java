package model;

public abstract class Employee implements Salary, Comparable<Employee> {

	private String name;
	private String id;
	private ContractType contract;
	private Date startingDate;

	public Employee(String name, String id, int contract, int year, int month, int day) {
		super();
		this.name = name;
		this.id = id;

		switch (contract) {
		case 1:
			this.contract = ContractType.FULL_TIME;
			break;
		case 2:
			this.contract = ContractType.HALF_TIME;
			break;
		case 3:
			this.contract = ContractType.SERVICE;
			break;
		}
		this.startingDate = new Date(day, month, year);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ContractType getContract() {
		return contract;
	}

	public void setContract(ContractType contract) {
		this.contract = contract;
	}

	@Override
	public abstract String toString();

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	@Override
	public int compareTo(Employee o) {

		int comparison = 0;

		if (this.getStartingDate().getYear() - o.getStartingDate().getYear() > 0) {

			comparison = 1;

		} else if (this.getStartingDate().getYear() - o.getStartingDate().getYear() < 0) {

			comparison = -1;

		} else if (this.getStartingDate().getMonth() - o.getStartingDate().getMonth() > 0) {

			comparison = 1;

		} else if (this.getStartingDate().getMonth() - o.getStartingDate().getMonth() < 0) {

			comparison = -1;
		} else if (this.getStartingDate().getDay() - o.getStartingDate().getDay() > 0) {

			comparison = 1;

		} else if (this.getStartingDate().getDay() - o.getStartingDate().getDay() < 0) {

			comparison = -1;
		} else {

			comparison = 0;
		}

		return comparison;
	}

}
