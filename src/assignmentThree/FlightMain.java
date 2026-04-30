package assignmentThree;

import java.util.Scanner;
import assignmentThree.Passenger.PassengerType;
import assignmentThree.Passenger.SeatClass;

public class FlightMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Flight flight = new Flight("AC101", 2, 1);

		System.out.println("Enter number of passengers to book: ");
		int numOfPassenger = sc.nextInt();

		for (int i = 0; i < numOfPassenger; i++) {
			System.out.println("Enter Passenger ID: ");
			int id = sc.nextInt();
			if (id <= 0) {
				System.out.println("Not Valid Entry for Passenger ID");
			} else {
				sc.nextLine();

				System.out.println("Enter Passenger Name: ");
				String name = sc.nextLine();
				if (name == null) {
					System.out.println("Not Valid Entry for Passenger Name");
				} else {

					System.out.println("Enter Age: ");
					int age = sc.nextInt();
					if (age < 0) {
						System.out.println("Not Valid Entry for Passenger Age");
					} else {

						System.out.println("Enter Passenger Type: ");
						String passengerType = sc.next();
						PassengerType type = PassengerType.valueOf(passengerType);
						if (type == null) {
							System.out.println("Not Valid Entry for Passenger Type");
						} else {

							System.out.println("Enter Seat Class: ");
							String seatType = sc.next();
							SeatClass seat = SeatClass.valueOf(seatType);
							if (seat == null) {
								System.out.println("Not Valid Entry for Passenger Seat");
							} else {

								System.out.println("Enter Baggage Weight: ");
								double baggageWeight = sc.nextDouble();
								if (baggageWeight <= 0) {
									System.out.println("Not Valid Entry for Passenger Baggage Weight");
								} else {

									String formattedName = flight.formatName(name);
									Passenger passenger = new Passenger(id, formattedName, age, type, seat,
											baggageWeight);
									flight.booking(passenger);

								}

							}
						}
					}
				}
			}
		}
		flight.summary();
	}
}