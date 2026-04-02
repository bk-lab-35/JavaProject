package assignmentOne;

public class DiscountCalculator {

	double productPrice;
	double newProductPrice;
	String promoCode;
	double discount = .5;
	double newPromoCodePrice;

	void calculateDiscount() {
		newProductPrice = productPrice * discount;

		if (promoCode.equals("Promo5") || promoCode.equals("promo5")) {
			newPromoCodePrice = productPrice * (1.00 - (discount + .05));
			System.out.println("New Product Price after discount is: " + newPromoCodePrice);
		} else if (promoCode.equals("Promo10") || promoCode.equals("promo10")) {
			newPromoCodePrice = productPrice * (1.00 - (discount + .10));
			System.out.println("New Product Price after discount is: " + newPromoCodePrice);
		}

		else if (promoCode.equals("Promo20") || promoCode.equals("promo20")) {
			newPromoCodePrice = productPrice * (1.00 - (discount + .20));
			System.out.println("New Product Price after discount is: " + newPromoCodePrice);
		}

		else {
			System.out.println("New Product Price after discount is: " + newProductPrice);
		}

	}

}
