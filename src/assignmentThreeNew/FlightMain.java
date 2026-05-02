package assignmentThreeNew;

import java.util.Scanner;

public class FlightMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Flight flight = new Flight("AC101", 2, 1);

		InputValidator.runCompleteBookingSystem(sc, flight);

	}
}