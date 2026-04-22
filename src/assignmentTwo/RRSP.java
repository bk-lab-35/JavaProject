package assignmentTwo;

public class RRSP {
	double calculateRRSP(double baseAmount, int years) {
		double interestRate = .05;
		return baseAmount * interestRate * years;
	}

}
