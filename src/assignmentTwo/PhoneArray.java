package assignmentTwo;

public class PhoneArray {
	String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] apple = { "Iphone12", "Iphone 12 mini", "Iphone 11", "Iphone 11" };

	void displayProductName(String brand) {
		if (brand.equals("samsung")) {
			System.out.println("All Available Samsung Products");
			for (String product : samsung) {
				System.out.println(product);
			}

		}
		if (brand.equals("google")) {
			System.out.println("All Available Google Products");
			for (String product : google) {
				System.out.println(product);

			}

		}
		if (brand.equals("apple")) {
			System.out.println("All Available Apple Products");
			for (String product : apple) {
				System.out.println(product);

			}

		}

	}

	boolean selectProducts(String brand, String productName) {
		String[] selectedProducts = null;
		if (brand.equals("samsung")) {
			selectedProducts = samsung;
		} else if (brand.equals("google")) {
			selectedProducts = google;
		} else if (brand.equals("apple")) {
			selectedProducts = apple;
		}

		if (selectedProducts != null) {
			for (String product : selectedProducts) {
				if (product.equals(productName)) {
					return true;
				}
			}
		}
		return false;
	}

}
