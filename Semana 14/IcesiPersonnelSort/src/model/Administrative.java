package model;

public class Administrative extends Employee {

	private Position position;

	public Administrative(String name, String id, int contract, int year, int month, int day, int position) {
		super(name, id, contract, year, month, day);

		switch (position) {

		case 1:
			this.position = Position.DIRECTOR;
			break;
		case 2:
			this.position = Position.HEAD;
			break;
		case 3:
			this.position = Position.COORDINATOR;
			break;
		case 4:
			this.position = Position.ASSISTANT;
			break;
		case 5:
			this.position = Position.TECHNICIAN;
			break;
		}

	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {

		String msg = "";

		msg += "ID: " + getId() + "\nName: " + getName() + "\nStarting Date: " + getStartingDate() + "\nContract: "
				+ getContract() + "\nPosition: " + this.position.name();

		return msg;
	}

	@Override
	public double calculateSalary() {

		double salary = minimumWage;

		switch (this.position.ordinal()) {
		case 0:
			salary *= 6;
			break;
		case 1:
			salary *= 4.5;
			break;
		case 2:
			salary *= 3.5;
			break;
		case 3:
			salary *= 2;
			break;
		case 4:
			salary *= 1;
			break;
		}
		return salary;

	}

}
