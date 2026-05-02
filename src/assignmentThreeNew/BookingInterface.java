package assignmentThreeNew;

public interface BookingInterface {

	double calculateTotalFare();

	void confirmBooking();

	String getBookingStatus();

	default void displayBookingInfo() {
		System.out.println("Booking: " + getBookingStatus());
		System.out.println("Total Fare: $" + calculateTotalFare());
	}
}