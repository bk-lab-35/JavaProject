package learnOperations;

public class ArithmeticOperators {
	
	int num1;
	int num2;
	
	void addTwoNumber() {
		int sum = num1 + num2;
		System.out.println("Addition of "+num1 +" and " +num2  +" is " +sum);
	}
	
	void subtractTwoNumbers() {
		int difference = num1- num2;
		System.out.println("Difference of "+num1 +" and " +num2  +" is " +difference);
	}
	
	void multiplyTwoNumbers() {
		int product = num1* num2;
		System.out.println("Product of "+num1 +" and " +num2  +" is " +product);
	}
	
	void divideTwoNumbers() {
		int quotient = num1/ num2;
		int remainder= num1%num2;
		System.out.println("Quotient of "+num1 +" and " +num2  +" is " +quotient);
		System.out.println("Remainder of "+num1 +" and " +num2  +" is " +remainder);
	}

}
