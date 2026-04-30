package assignmentTwo;

public class Employee {
	String firstName;
	String lastName;
	double hourlyPay;

	public Employee(String firstName, String lastName, double hourlyPay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyPay = hourlyPay;
	}

	void employeeInformation() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Hourly Pay: " + hourlyPay);

	}

	void weeklySalary(int hoursWorked) {
		double weeklyPay = hourlyPay * hoursWorked;
		System.out.println("The Weekly Pay is: " + weeklyPay);
	}

}
