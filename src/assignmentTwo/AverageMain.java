package assignmentTwo;
import java.util.Scanner;

public class AverageMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Average average = new Average();
		
		System.out.println("Enter 5 Numbers: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		
		System.out.println("The Average of all 5 numbers are: "+average.calculateAverage(n1, n2, n3, n4, n5));
		

	}
}
