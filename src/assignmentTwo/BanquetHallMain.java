package assignmentTwo;

import java.util.Scanner;

public class BanquetHallMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BanquetHall banquetHall = new BanquetHall();

		System.out.println("Enter Base Booking Cost: ");
		if (!sc.hasNextDouble()) {
			System.out.println("You have entered the wrong input");
		}
		double baseBookingCost = sc.nextDouble();
		if (baseBookingCost < 0) {
			System.out.println("You have entered the wrong input");
		}

		else {

			System.out.println("Enter Food Cost: ");
			if (!sc.hasNextDouble()) {
				System.out.println("You have entered the wrong input");
			}
			double foodCost = sc.nextDouble();
			if (foodCost < 0) {
				System.out.println("You have entered the wrong input");
			} else {

				System.out.println("Enter Beverage Cost: ");
				if (!sc.hasNextDouble()) {
					System.out.println("You have entered the wrong input");
				}
				double beverageCost = sc.nextDouble();
				if (beverageCost < 0) {
					System.out.println("You have entered the wrong input");
				} else {

					System.out.println("Enter Amount of tip: ");
					if (!sc.hasNextDouble()) {
						System.out.println("You have entered the wrong input");
					}
					double tip = sc.nextDouble();
					if (tip < 0) {
						System.out.println("You have entered the wrong input");
					} else {

						System.out.println("Enter Amount of Guests: ");
						if (!sc.hasNextInt()) {
							System.out.println("You have entered the wrong input");
						}
						int numberOfGuests = sc.nextInt();
						if (numberOfGuests < 0) {
							System.out.println("You have entered the wrong input");
						} else {

							double baseCost = banquetHall.calculateBaseCost(baseBookingCost, foodCost, beverageCost,
									tip);
							double tax = banquetHall.calculateTax(baseCost);
							double cess = banquetHall.calculateCost(numberOfGuests, baseCost);

							System.out.println(
									"The Total Cost is: " + banquetHall.calculateTheTotalCost(baseCost, tax, cess));

						}

					}
				}
			}
		}
	}
}
