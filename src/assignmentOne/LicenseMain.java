package assignmentOne;

import java.util.Scanner;

public class LicenseMain {

	public static void main(String[] args) {
		License l = new License();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age: ");
		l.age = sc.nextInt();

		System.out.println("Enter your Current License: ");
		l.currentLicense = sc.next();

		l.validateAgeForLicense();

	}

}
