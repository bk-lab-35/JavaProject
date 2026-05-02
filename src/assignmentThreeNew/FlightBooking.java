package assignmentThreeNew;

import java.util.ArrayList;
import java.util.List;

public class FlightBooking implements BookingInterface {
	private static int nextBookingId = 1;
	private int bookingId;
	private Passenger passenger;
	private double totalFare;
	private String status;
	private String failureReason;
	private static List<FlightBooking> allBookings = new ArrayList<>();

	public FlightBooking(Passenger passenger) {
		this.bookingId = nextBookingId++;
		this.passenger = passenger;
		this.totalFare = 0;
	}

	@Override
	public double calculateTotalFare() {
		double baseFare = passenger.getSeat().getBaseFare();
		double discount = passenger.getType().getDiscount();
		double baggageFee = getBaggageFee(passenger.getBaggageWeight());
		double afterDiscount = baseFare * (1 - discount);
		this.totalFare = afterDiscount + baggageFee;
		return this.totalFare;
	}

	@Override
	public void confirmBooking() {
		this.status = "CONFIRMED";
		allBookings.add(this);
	}

	@Override
	public String getBookingStatus() {
		return this.status;
	}

	private double getBaggageFee(double weight) {
		return weight > 15 ? (weight - 15) * 20 : 0;
	}

	public void setFailureReason(String reason) {
		this.failureReason = reason;
		this.status = "FAILED";
	}

	public void display() {
		System.out.println("Booking ID: " + bookingId);
		System.out.println("Passenger Name: " + passenger.getName());
		System.out.println("Passenger Type: " + passenger.getType());
		System.out.println("Seat Class: " + passenger.getSeat());

		if (status.equals("CONFIRMED")) {
			System.out.println("Base Fare: " + passenger.getSeat().getBaseFare() + ".0");
			System.out.println("Baggage Fee: " + getBaggageFee(passenger.getBaggageWeight()) + ".0");
			System.out.println("Total Fare: " + totalFare + ".0");
			System.out.println("Booking Status: " + status);
		} else if (status.equals("FAILED")) {
			System.out.println("Booking Status: " + status);
			System.out.println("Reason: " + failureReason);
		}
		System.out.println("------------------------------");
	}

	public static List<FlightBooking> getAllBookings() {
		return new ArrayList<>(allBookings);
	}

	public static List<FlightBooking> getConfirmedBookings() {
		List<FlightBooking> confirmed = new ArrayList<>();
		for (FlightBooking booking : allBookings) {
			if (booking.status.equals("CONFIRMED")) {
				confirmed.add(booking);
			}
		}
		return confirmed;
	}

	public static double getTotalRevenue() {
		double total = 0;
		for (FlightBooking booking : allBookings) {
			if (booking.status.equals("CONFIRMED")) {
				total += booking.totalFare;
			}
		}
		return total;
	}
}