package assignmentOne;

import java.util.Scanner;

public class DiscountMain {

	public static void main(String[] args) {
		DiscountCalculator discountCalculator = new DiscountCalculator();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Price: ");
		discountCalculator.productPrice = sc.nextDouble();

		if (discountCalculator.productPrice <= 0) {
			System.out.println("Valid product price has not been entered");
		} else {

			System.out.println("Enter Promo Code: ");
			discountCalculator.promoCode = sc.next();

			discountCalculator.calculateDiscount();

		}

	}

}
