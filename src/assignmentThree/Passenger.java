package assignmentThree;

public class Passenger {
	protected int id;
	protected String name;
	protected int age;
	protected PassengerType type;
	protected SeatClass seat;
	protected double baggageWeight;

	public Passenger(int id, String name, int age, PassengerType passenger, SeatClass seat, double baggageWeight) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.type = passenger;
		this.seat = seat;
		this.baggageWeight = baggageWeight;
	}

	public enum PassengerType {
		ADULT, 
		CHILD, 
		SENIOR
	}

	public enum SeatClass {
		ECONOMY, 
		BUSINESS

	}

}
