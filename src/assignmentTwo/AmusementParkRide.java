package assignmentTwo;

public class AmusementParkRide {

	boolean checkEligbility(Person person) {
		if (person.height < 90 || person.height > 200) {
			return false;
		}
		if (person.weight < 15 || person.weight > 95) {
			return false;
		}
		return true;
	}

}
