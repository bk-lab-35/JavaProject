package assignmentTwo;

public class AmusementParkRideMain {
	public static void main(String[] args) {
		Person person1 = new Person("JOhn", 300, 300);

		AmusementParkRide amusementPark = new AmusementParkRide();

		if (amusementPark.checkEligbility(person1) == false) {
			System.out.println("Person 1 is not eligible to go on the ride");
		} else {
			System.out.println("Person 1 is eligible to go on the ride");

		}
	}

}
