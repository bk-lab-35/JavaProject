package assignmentThre;

public enum SeatClass {
	ECONOMY("Economy", 500), 
	BUSINESS("Business", 1200);

	String seatName;
	final double baseFare;

	SeatClass(String seatName, double baseFare) {
		this.seatName = seatName;
		this.baseFare = baseFare;
	}

	public String getSeatName() {
		return seatName;
	}

	public double getBaseFare() {
		return baseFare;
	}

}
