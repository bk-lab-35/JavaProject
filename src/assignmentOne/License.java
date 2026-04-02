package assignmentOne;

public class License {

	int age;

	String currentLicense;

	void validateAgeForLicense() {
		if (age >= 16) {
			if (currentLicense.equals("G1")) {
				System.out.println("You are eligible for a G2");
			} else if (currentLicense.equals("G2")) {
				System.out.println("You are eligible for a G");
			} else {
				System.out.println("You are eligible for a G1");
			}

		} else {
			System.out.println("You are not valid for an Ontario Driving License");
		}

	}

}
