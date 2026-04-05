package assignmentOne;

import java.util.Scanner;

public class LicenseMain {

	public static void main(String[] args) {
		License licenseUser = new License();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age: ");
		licenseUser.age = sc.nextInt();

		if (licenseUser.age < 16) {
			System.out.println("You are not valid for an Ontario Driving License");
		} else {
			System.out.println("Enter your Current License: ");
			licenseUser.currentLicense = sc.next();
			licenseUser.validateAgeForLicense();
		}

	}

}
