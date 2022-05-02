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

	public String showEmployeeInfo() {

		String msg = "";

		for (int i = 0; i < employees.length; i++) {

			if (employees[i] != null) {

				msg += "\n" + employees[i].toString();

			}
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

	public boolean registerProfessor(String name, String id, int contractType, int year, int month, int day, int degree,
			int courses) {

		boolean professorAdded = false;

		for (int i = 0; i < employees.length && !professorAdded; i++) {
			if (employees[i] == null) {

				employees[i] = new Professor(name, id, contractType, year, month, day, degree, courses);

				professorAdded = true;
			}

		}

		return professorAdded;

	}

	public boolean registerAdministrative(String name, String id, int contractType, int year, int month, int day,
			int positionType) {
		boolean administrativeAdded = false;

		for (int i = 0; i < employees.length && !administrativeAdded; i++) {
			if (employees[i] == null) {

				employees[i] = new Administrative(name, id, contractType, year, month, day, positionType);

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

	public void sortEmployees() {

		Employee temp;
		for (int i = 1; i < employees.length; i++) {
			for (int j = i; j > 0; j--) {

				if (employees[j] != null && employees[j - 1] != null) {

					if (employees[j].compareTo(employees[j - 1]) < 1) {
						temp = employees[j];
						employees[j] = employees[j - 1];
						employees[j - 1] = temp;
					}
				}
			}
		}

	}

}
