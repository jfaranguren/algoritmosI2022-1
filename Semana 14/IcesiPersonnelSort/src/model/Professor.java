package model;

public class Professor extends Employee {

	private Degree degree;
	private int courses;

	public Professor(String name, String id, int contract, int year, int month, int day, int degree, int courses) {
		super(name, id, contract, year, month, day);

		switch (degree) {
		case 1:
			this.degree = Degree.PHD;

			break;
		case 2:
			this.degree = Degree.MASTER;
			break;
		case 3:
			this.degree = Degree.SPECIALIZATION;
			break;
		case 4:
			this.degree = Degree.BACHELOR;
			break;
		}

		this.courses = courses;

	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public int getCourses() {
		return courses;
	}

	public void setCourses(int courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {

		String msg = "";

		msg += "\nID: " + getId() + "\nName: " + getName() + "\nStarting Date: " + getStartingDate() +  "\nContract: " + getContract() + "\nDegree: " + this.degree
				+ "\nCourses: " + this.courses + "\nHourly rate: " + this.degree.getRate();

		return msg;
	}

	@Override
	public double calculateSalary() {

		double salary = this.courses * 3 * minimumWage * this.degree.getRate();

		return salary;
	}

}
