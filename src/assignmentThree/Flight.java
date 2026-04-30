package assignmentThree;

import assignmentThree.Passenger.PassengerType;
import assignmentThree.Passenger.SeatClass;

public class Flight {

	private String flightNumber;
	private int economySeats;
	private int businessSeats;
	private int successBooking;
	private int totalRevenue;

	public Flight(String flightNumber, int economySeats, int businessSeats) {
		this.flightNumber = flightNumber;
		this.economySeats = economySeats;
		this.businessSeats = businessSeats;

	}

	String formatName(String name) {
		String[] chars = name.trim().split("\\s+");
		for (int i = 0; i < chars.length; i++) {
			chars[i] = chars[i].substring(0, 1).toUpperCase() + chars[i].substring(1).toLowerCase();
		}
		return String.join(" ", chars);
	}

	double getBaseFare(SeatClass seat) {
		return seat == SeatClass.ECONOMY ? 500 : 1200;
	}

	double getDiscount(PassengerType passenger) {
		if (passenger == PassengerType.CHILD)
			return .5;
		if (passenger == PassengerType.SENIOR)
			return .3;
		return 0;
	}

	double getBaggageFee(double baggageWeight) {
		return baggageWeight > 15 ? (baggageWeight - 15) * 20 : 0;
	}

	boolean hasSeats(SeatClass seat) {
		return seat == SeatClass.ECONOMY ? economySeats > 0 : businessSeats > 0;

	}

	void bookSeat(SeatClass seat) {
		if (seat == SeatClass.BUSINESS)
			businessSeats--;
		else
			economySeats--;
	}

	void booking(Passenger passenger) {
		double baseFare = getBaseFare(passenger.seat);
		double discount = getDiscount(passenger.type);
		double baggageFee = getBaggageFee(passenger.baggageWeight);
		double afterDiscount = baseFare * (1 - discount);
		double totalFare = afterDiscount + baggageFee;

		if (!hasSeats(passenger.seat)) {
			System.out.println("Booking ID: " + passenger.id);
			System.out.println("Passenger Name: " + passenger.name);
			System.out.println("Passenger Type: " + passenger.type);
			System.out.println("Seat Class: " + passenger.seat);
			System.out.println("Booking Status: Failed");
			System.out.println("Reason: No seats available in " + passenger.seat);
			System.out.println("------------------------------------------------");
			return;
		}

		bookSeat(passenger.seat);

		successBooking++;
		totalRevenue += totalFare;
		System.out.println("Booking ID: " + passenger.id);
		System.out.println("Passenger Name: " + passenger.name);
		System.out.println("Passenger Type: " + passenger.type);
		System.out.println("Seat Class: " + passenger.seat);
		System.out.println("Base Fare: " + baseFare);
		System.out.println("Baggage Fee: " + baggageFee);
		System.out.println("Total Fare: " + totalFare);
		System.out.println("Booking Status: Confirmed");
		System.out.println("------------------------------------------------");

	}

	void summary() {
		System.out.println("Total Successful Bookings: " + successBooking);
		System.out.println("Total Revenue: " + totalRevenue);
		System.out.println("Remaining Economy Seats: " + economySeats);
		System.out.println("Remaining Busines Seats: " + businessSeats);

	}
}