package assignmentThre;

public class Passenger {
	private int id;
	private String name;
	private int age;
	private SeatClass seat;
	private double baggageWeight;

	public Passenger(int id, String name, int age, SeatClass seat, double baggageWeight) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.seat = seat;
		this.baggageWeight = baggageWeight;
	}

	String formatName(String name) {
		if (name == null || name.trim().isEmpty())
			return "";
		String[] chars = name.trim().split("\\s+");
		for (int i = 0; i < chars.length; i++) {
			chars[i] = chars[i].substring(0, 1).toUpperCase() + chars[i].substring(1).toLowerCase();
		}
		return String.join(" ", chars);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return formatName(name);
	}

	public int getAge() {
		return age;
	}

	public SeatClass getSeatClass() {
		return seat;
	}

	public double getBaggageWeight() {
		return baggageWeight;
	}

	public double calculateBaggageWeight() {
		return baggageWeight > 15 ? (baggageWeight - 15) * 20 : 0;
	}

	public double calculateTotalFare() {
		return 0;
	}

	public String getPassengerType() {
		return null;
	}

}
