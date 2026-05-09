package assignmentThre;

import java.util.Scanner;

public class BookingManager {
	private String flightNumber;
	private int economySeats;
	private int businessSeats;
	private double totalRevenue = 0;
	private int succesfulBookingCounter = 0;

	public BookingManager(String flightNumber, int economySeats, int businessSeats) {
		this.flightNumber = flightNumber;
		this.economySeats = economySeats;
		this.businessSeats = businessSeats;

	}

	public void processBookings() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of passengers to book: ");
		if (!sc.hasNextInt()) {
			System.out.println("Invalid input");
		}
		int n = sc.nextInt();

		Passenger[] confirmedPassenger = new Passenger[n];
		Passenger[] failedPassenger = new Passenger[n];

		int bookingID = 1;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Passenger ID: ");
			if (!sc.hasNextInt()) {
				System.out.println("Booking Status: Failed\nReason: Invalid input");
				break;
			}
			int id = sc.nextInt();
			sc.nextLine();
			if (id <= 0) {
				System.out.println("Booking Status: Failed\nReason: Passenger ID must be greater than 0");
				break;

			}

			System.out.println("Enter Passenger Name: ");
			String name = sc.nextLine();

			if (name == null || name.trim().isEmpty() || !name.matches("^[a-zA-Z ]+$")) {
				System.out.println("Booking Status: Failed\nReason: Passenger name input is invalid");
				break;
			}

			System.out.println("Enter Age: ");
			if (!sc.hasNextInt()) {
				System.out.println("Booking Status: Failed\nReason: Invalid input");
				break;
			}
			int age = sc.nextInt();
			sc.nextLine();
			if (age <= 0) {
				System.out.println("Booking Status: Failed\nReason: Passenger Age can not be negative or 0");
				break;

			}

			System.out.println("Enter Passenger Type: ");
			if (!sc.hasNext()) {
				System.out.println("Booking Status: Failed\nReason: Invalid input");
				break;
			}
			String type = sc.next().toUpperCase();
			sc.nextLine();
			if (!type.equals("ADULT") && !type.equals("CHILD") && !type.equals("SENIOR")) {
				System.out.println("Booking Status: Failed\nReason: Passenger type input is invalid");
				break;

			}

			System.out.println("Enter Seat Class: ");
			if (!sc.hasNext()) {
				System.out.println("Booking Status: Failed\nReason: Invalid input");
				break;
			}
			String seatClass = sc.next().toUpperCase();
			sc.nextLine();
			if (!seatClass.equals("ECONOMY") && !seatClass.equals("BUSINESS")) {
				System.out.println("Booking Status: Failed\nReason: Passenger Seat input is invalid");
				break;

			}

			System.out.println("Enter Baggage Weight ");
			if (!sc.hasNextDouble()) {
				System.out.println("Booking Status: Failed\nReason: Invalid input");
				break;
			}
			int baggageWeight = sc.nextInt();
			sc.nextLine();
			if (baggageWeight < 0) {
				System.out.println("Booking Status: Failed\nReason: Passenger baggage weight can not be negative");
				break;

			}

			SeatClass seat = seatClass.equals("ECONOMY") ? SeatClass.ECONOMY : SeatClass.BUSINESS;

			Passenger passenger;
			switch (type) {
			case "CHILD":
				passenger = new ChildPassenger(bookingID, name, age, seat, baggageWeight);
				break;

			case "SENIOR":
				passenger = new SeniorPassenger(bookingID, name, age, seat, baggageWeight);
				break;
			default:
				passenger = new AdultPassenger(bookingID, name, age, seat, baggageWeight);
				break;
			}

			if (hasSpace(seat)) {

				double fare = passenger.calculateTotalFare();
				confirmBooking(seat, fare);
				confirmedPassenger[i] = passenger;

			} else {
				failedPassenger[i] = passenger;
			}
			bookingID++;

		}
		for (int i = 0; i < n; i++) {
			if (confirmedPassenger[i] != null) {
				printConfirmedPassenger(confirmedPassenger[i]);
			} else if (failedPassenger[i] != null) {
				printFailedPassenger(failedPassenger[i]);
			}
			System.out.println("------------------------------");

		}

		displaySummary();
	}

	private void printConfirmedPassenger(Passenger passenger) {
		System.out.println("Booking ID: " + passenger.getId());
		System.out.println("Passenger Name: " + passenger.getName());
		System.out.println("Passenger Type: " + passenger.getPassengerType());
		System.out.println("Seat Class: " + passenger.getSeatClass());
		System.out.println("Base Fare: " + passenger.getSeatClass().getBaseFare());
		System.out.println("Baggage Fee: " + passenger.calculateBaggageWeight());
		System.out.println("Total Fare: " + passenger.calculateTotalFare());
		System.out.println("Booking Status: CONFIRMED");

	}

	private void printFailedPassenger(Passenger passenger) {
		System.out.println("Booking ID: " + passenger.getId());
		System.out.println("Passenger Name: " + passenger.getName());
		System.out.println("Passenger Type: " + passenger.getPassengerType());
		System.out.println("Seat Class: " + passenger.getSeatClass());
		System.out.println("Booking Status: FAILED");
		System.out.println("Reason: No seats available in " + passenger.getSeatClass());

	}

	private boolean hasSpace(SeatClass seat) {
		if (seat == SeatClass.ECONOMY)
			return economySeats > 0;
		return businessSeats > 0;

	}

	private void confirmBooking(SeatClass seat, double fare) {
		if (seat == SeatClass.ECONOMY)
			economySeats--;
		else
			businessSeats--;
		totalRevenue += fare;
		succesfulBookingCounter++;
	}

	private void displaySummary() {
		System.out.println("Total Succesful Bookings: " + succesfulBookingCounter);
		System.out.println("Total Revenue: " + totalRevenue);
		System.out.println("Remaining Economy Seats: " + economySeats);
		System.out.println("Remaining Business Seats: " + businessSeats);

	}
}
