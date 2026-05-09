package assignmentThre;

public class AdultPassenger extends Passenger {

	public AdultPassenger(int id, String name, int age, SeatClass seat, double baggageWeight) {
		super(id, name, age, seat, baggageWeight);
	}

	@Override
	public double calculateTotalFare() {
		return getSeatClass().getBaseFare() + calculateBaggageWeight();
	}

	public String getPassengerType() {
		return "Adult";
	}

}
