package learnOperations;

public class OperatorsMain {

	public static void main(String[] args) {
		//Instantiating the Class
		ArithmeticOperators ao = new ArithmeticOperators();

		ao.num1=8;
		ao.num2=10;
		ao.addTwoNumber();
		
		System.out.println("Reassigning the values");
		
		ao.num1=15;
		ao.num2=6;
	
		ao.addTwoNumber();

		System.out.println("Now Subtraction");
		ao.subtractTwoNumbers();
		
		ao.multiplyTwoNumbers();
		
		ArithmeticOperators ao1 = new ArithmeticOperators();
		ao1.num1=45;
		ao1.num2=10;
		
		ao1.divideTwoNumbers();
		
		AssignmentOperator a2= new AssignmentOperator();
		a2.findAgeAfter5Year();
		a2.findAgeBefore10Year();
		a2.findAgeInHalf();


	}

}
