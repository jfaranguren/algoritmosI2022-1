package model;

public class IcesiPersonnelController {

	private Employee[] employees;

	public IcesiPersonnelController() {

		this.employees = new Employee[10];

	}

	public String showEmployeeInfo(int i) {

		String msg = "";

		if (employees[i] != null) {

			msg += employees[i].toString();

		}

		return msg;

	}

	public String showEmployeesList() {

		String employeesRegistered = "";

		for (int i = 0; (i < employees.length); i++) {

			if (employees[i] != null) {

				employeesRegistered += "\n" + (i + 1) + ". ";

				if (employees[i] instanceof Professor) {

					employeesRegistered += "Professor - ";

				} else if (employees[i] instanceof Administrative) {

					employeesRegistered += "Administrative - ";
				}

				employeesRegistered += employees[i].getName() + " - " + employees[i].getContract();

			}

		}

		return employeesRegistered;

	}

	public boolean registerProfessor(String name, String id, int contractType, int degree, int courses) {

		boolean professorAdded = false;

		for (int i = 0; i < employees.length && !professorAdded; i++) {
			if (employees[i] == null) {

				employees[i] = new Professor(name, id, contractType, degree, courses);

				professorAdded = true;
			}

		}

		return professorAdded;

	}

	public boolean registerAdministrative(String name, String id, int contractType, int positionType) {
		boolean administrativeAdded = false;

		for (int i = 0; i < employees.length && !administrativeAdded; i++) {
			if (employees[i] == null) {

				employees[i] = new Administrative(name, id, contractType, positionType);

				administrativeAdded = true;
			}

		}

		return administrativeAdded;
	}

	public String showSalary(int id) {

		String salaryInfo = "";

		if (employees[id] != null) {

			salaryInfo += "\n" + employees[id].calculateSalary();
		}
		return salaryInfo;
		
	}

}
