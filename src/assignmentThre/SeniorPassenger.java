package assignmentThre;

public class SeniorPassenger extends Passenger {
	public SeniorPassenger(int id, String name, int age, SeatClass seat, double baggageWeight) {
		super(id, name, age, seat, baggageWeight);
	}

	@Override
	public double calculateTotalFare() {
		return (getSeatClass().getBaseFare() * .7) + calculateBaggageWeight();
	}

	public String getPassengerType() {
		return "Senior";
	}

}
