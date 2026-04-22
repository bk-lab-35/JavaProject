package assignmentTwo;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneArray phoneBrand = new PhoneArray();

		System.out.println("Enter Product Name you are looking for : ");
		String brand = sc.nextLine();
		phoneBrand.displayProductName(brand);
		
		System.out.println("\nEnter product name from the list above: ");
        String selectedProduct = sc.nextLine();
        
        if (phoneBrand.selectProducts(brand, selectedProduct)) {
            System.out.println("product selected is : " + selectedProduct);
        } else {
            System.out.println("Please select a product from the list");
        }

	}
}
