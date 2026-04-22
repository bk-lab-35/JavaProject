package assignmentTwo;
import java.util.Scanner;

public class BanquetHallMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BanquetHall banquetHall = new BanquetHall();
		
		System.out.println("Enter Base Booking Cost: ");
		if(!sc.hasNextDouble()) {
			System.out.println("You have entered the wrong input");
		}
		double baseBookingCost = sc.nextDouble(); 
		
		System.out.println("Enter Food Cost: ");
		if(!sc.hasNextDouble()) {
			System.out.println("You have entered the wrong input");
		}
		double foodCost = sc.nextDouble();
		
		System.out.println("Enter Beverage Cost: ");
		if(!sc.hasNextDouble()) {
			System.out.println("You have entered the wrong input");
		}
		double beverageCost = sc.nextDouble();
		
		System.out.println("Enter Amount of tip: ");
		if(!sc.hasNextDouble()) {
			System.out.println("You have entered the wrong input");
		}
		double tip = sc.nextDouble();
		
		System.out.println("Enter Amount of Guests: ");
		if(!sc.hasNextInt()) {
			System.out.println("You have entered the wrong input");
		}
		int numberOfGuests = sc.nextInt();
		
		double baseCost = banquetHall.calculateBaseCost(baseBookingCost, foodCost, beverageCost, tip);
		double tax = banquetHall.calculateTax(baseCost);
		double cess = banquetHall.calculateCost(numberOfGuests, baseCost);
		
		System.out.println("The Total Cost is: "+banquetHall.calculateTheTotalCost(baseCost, tax, cess));


	}

}
