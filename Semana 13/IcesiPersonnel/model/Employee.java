package model;

public abstract class Employee implements Salary{

	private String name;
	private String id;
	private ContractType contract;

	public Employee(String name, String id, int contract) {
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

}
