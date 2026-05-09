package assignmentThre;

public class ChildPassenger extends Passenger {
	public ChildPassenger(int id, String name, int age, SeatClass seat, double baggageWeight) {
		super(id, name, age, seat, baggageWeight);
	}

	@Override
	public double calculateTotalFare() {
		return (getSeatClass().getBaseFare() * .5) + calculateBaggageWeight();
	}

	public String getPassengerType() {
		return "Child";
	}

}
