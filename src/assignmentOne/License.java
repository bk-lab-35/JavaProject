package assignmentOne;

public class License {

	int age;

	String currentLicense;

	void validateAgeForLicense() {
		if (age < 18 && currentLicense.equals("G")) {
			System.out.println("That is incorrect, you must be atleast 18 for a G License");
		} else if (age < 17 && currentLicense.equals("G2")) {
			System.out.println("That is incorrect, you must be atleast 17 for a G2 License2");
		} else {

			if (currentLicense.equals("G1")) {
				System.out.println("You are eligible for a G2");
			} else if (currentLicense.equals("G2")) {
				System.out.println("You are eligible for a G");
			} else if (currentLicense.equals("G")) {
				System.out.println("You have a G license");
			} else {
				System.out.println("You are eligible for a G1");
			}
		}

	}

}
