package assignmentThreeNew;

import java.util.Scanner;
import java.util.ArrayList;

public class InputValidator {

	public static int getValidatedInt(Scanner sc, String fieldName) {
		while (true) {
			System.out.print("Enter " + fieldName + ": ");
			if (!sc.hasNextInt()) {
				System.out.println("Not Valid Entry for " + fieldName);
				sc.next();
				continue;
			}
			int value = sc.nextInt();
			sc.nextLine();
			return value;
		}
	}

	public static String getValidatedString(Scanner sc, String fieldName) {
		while (true) {
			System.out.print("Enter " + fieldName + ": ");
			String value = sc.nextLine();
			if (value == null || value.trim().isEmpty()) {
				System.out.println("Not Valid Entry for " + fieldName);
				continue;
			}
			return value;
		}
	}

	public static PassengerType getValidatedPassengerType(Scanner sc) {
		while (true) {
			System.out.print("Enter Passenger Type: ");
			String typeStr = sc.nextLine().toUpperCase();
			if (Passenger.isValidPassengerType(typeStr)) {
				return PassengerType.valueOf(typeStr);
			}
			System.out.println("Not Valid Entry for Passenger Type");
		}
	}

	public static SeatClass getValidatedSeatClass(Scanner sc) {
		while (true) {
			System.out.print("Enter Seat Class: ");
			String seatStr = sc.nextLine().toUpperCase();
			if (Passenger.isValidSeatClass(seatStr)) {
				return SeatClass.valueOf(seatStr);
			}
			System.out.println("Not Valid Entry for Passenger Seat");
		}
	}

	public static double getValidatedBaggageWeight(Scanner sc) {
		while (true) {
			System.out.print("Enter Baggage Weight: ");
			if (!sc.hasNextDouble()) {
				System.out.println("Not Valid Entry for Passenger Baggage Weight");
				sc.next();
				continue;
			}
			double weight = sc.nextDouble();
			if (!Flight.isValidBaggageWeight(weight)) {
				System.out.println("Not Valid Entry for Passenger Baggage Weight");
				continue;
			}
			sc.nextLine();
			return weight;
		}
	}

	public static boolean isValidId(int id) {
		return id > 0;
	}

	public static boolean isValidAge(int age) {
		return age > 0;
	}

	public static Passenger collectOnePassenger(Scanner sc) {
		int id = getValidatedInt(sc, "Passenger ID");
		if (!isValidId(id)) {
			System.out.println("Not Valid Entry for Passenger ID");
			return null;
		}

		String name = getValidatedString(sc, "Passenger Name");

		int age = getValidatedInt(sc, "Age");
		if (!isValidAge(age)) {
			System.out.println("Not Valid Entry for Passenger Age");
			return null;
		}

		PassengerType type = getValidatedPassengerType(sc);
		SeatClass seat = getValidatedSeatClass(sc);
		double baggageWeight = getValidatedBaggageWeight(sc);

		String formattedName = Flight.formatName(name);
		return new Passenger(id, formattedName, age, type, seat, baggageWeight);
	}

	public static ArrayList<Passenger> collectAllPassengers(Scanner sc) {
		int numOfPassenger = getValidatedInt(sc, "number of passengers to book");

		ArrayList<Passenger> passengerList = new ArrayList<>();

		for (int i = 0; i < numOfPassenger; i++) {
			System.out.println();
			Passenger passenger = collectOnePassenger(sc);
			if (passenger == null) {
				return null;
			}
			passengerList.add(passenger);
		}

		return passengerList;
	}

	public static void processAllBookings(ArrayList<Passenger> passengerList, Flight flight) {
		System.out.println();
		for (Passenger passenger : passengerList) {
			flight.processBooking(passenger);
		}
	}

	public static void runCompleteBookingSystem(Scanner sc, Flight flight) {
		ArrayList<Passenger> passengerList = collectAllPassengers(sc);

		processAllBookings(passengerList, flight);
		flight.displaySummary();
	}
}