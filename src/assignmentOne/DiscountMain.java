package assignmentOne;

import java.util.Scanner;

public class DiscountMain {

	public static void main(String[] args) {
		DiscountCalculator discountCalculator = new DiscountCalculator();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Price: ");

		if (sc.hasNextDouble()) {
			discountCalculator.productPrice = sc.nextDouble();

			if (discountCalculator.productPrice <= 0) {
				System.out.println("Valid product price has not been entered");
			} else {

				System.out.println("Enter Promo Code: ");
				discountCalculator.promoCode = sc.next();
				if (discountCalculator.promoCode.equals("Promo5") || discountCalculator.promoCode.equals("Promo10")
						|| discountCalculator.promoCode.equals("Promo20")
						|| discountCalculator.promoCode.equals("None")) {
					discountCalculator.calculateDiscount();
				} else {
					System.out.println("Invalid Promo Input");
				}

			}

		} else {
			System.out.println("Valid product price has not been entered");
		}
	}

}
