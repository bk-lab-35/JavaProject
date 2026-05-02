package assignmentThreeNew;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	private static int flightCounter = 0;
	private String flightNumber;
	private int economySeats;
	private int businessSeats;
	private List<FlightBooking> bookings;

	public Flight(String flightNumber, int economySeats, int businessSeats) {
		this.flightNumber = flightNumber;
		this.economySeats = economySeats;
		this.businessSeats = businessSeats;
		this.bookings = new ArrayList<>();
		flightCounter++;
	}

	public static int getTotalFlightsCreated() {
		return flightCounter;
	}

	public static String formatName(String name) {
		if (name == null || name.trim().isEmpty())
			return "";
		String[] chars = name.trim().split("\\s+");
		for (int i = 0; i < chars.length; i++) {
			chars[i] = chars[i].substring(0, 1).toUpperCase() + chars[i].substring(1).toLowerCase();
		}
		return String.join(" ", chars);
	}

	public static boolean isValidBaggageWeight(double weight) {
		return weight >= 0;
	}

	private boolean hasSeats(SeatClass seat) {
		return seat == SeatClass.ECONOMY ? economySeats > 0 : businessSeats > 0;
	}

	private void bookSeat(SeatClass seat) {
		if (seat == SeatClass.BUSINESS)
			businessSeats--;
		else
			economySeats--;
	}

	public void processBooking(Passenger passenger) {
		FlightBooking booking = new FlightBooking(passenger);

		if (!hasSeats(passenger.getSeat())) {
			booking.setFailureReason("No seats available in " + passenger.getSeat());
			booking.display();
			return;
		}

		booking.calculateTotalFare();
		booking.confirmBooking();
		bookSeat(passenger.getSeat());
		booking.display();
		bookings.add(booking);
	}

	public void displaySummary() {
		System.out.println("Total Successful Bookings: " + FlightBooking.getConfirmedBookings().size());
		System.out.println("Total Revenue: " + FlightBooking.getTotalRevenue() + ".0");
		System.out.println("Remaining Economy Seats: " + economySeats);
		System.out.println("Remaining Business Seats: " + businessSeats);
	}
}