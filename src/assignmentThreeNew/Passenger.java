package assignmentThreeNew;

public class Passenger extends Person {
	private PassengerType type;
	private SeatClass seat;
	private double baggageWeight;
	private static int totalPassengersCreated = 0;

	public Passenger(int id, String name, int age, PassengerType type, SeatClass seat, double baggageWeight) {
		super(id, name, age);
		this.type = type;
		this.seat = seat;
		this.baggageWeight = baggageWeight;
		totalPassengersCreated++;
	}

	@Override
	public String getRole() {
		return "Passenger - " + type;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public PassengerType getType() {
		return type;
	}

	public SeatClass getSeat() {
		return seat;
	}

	public double getBaggageWeight() {
		return baggageWeight;
	}

	public static int getTotalPassengersCreated() {
		return totalPassengersCreated;
	}

	public static boolean isValidPassengerType(String typeStr) {
		if (typeStr.equals("ADULT")) {
			return true;
		} else if (typeStr.equals("CHILD")) {
			return true;
		} else if (typeStr.equals("SENIOR")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isValidSeatClass(String seatStr) {
		if (seatStr.equals("ECONOMY")) {
			return true;
		} else if (seatStr.equals("BUSINESS")) {
			return true;
		} else {
			return false;
		}
	}
}