package assignmentOne;

import java.util.Scanner;

public class DiscountMain {

	public static void main(String[] args) {
		DiscountCalculator d = new DiscountCalculator();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Price: ");
		d.productPrice = sc.nextDouble();

		System.out.println("Enter Promo Code: ");
		d.promoCode = sc.next();

		d.calculateDiscount();

	}

}
