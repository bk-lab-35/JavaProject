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
			if (licenseUser.currentLicense.equals("G1") || licenseUser.currentLicense.equals("G2")
					|| licenseUser.currentLicense.equals("G")) {
				licenseUser.validateAgeForLicense();
			} else {
				System.out.println("Invalid License Input");
			}
		}

	}
}
