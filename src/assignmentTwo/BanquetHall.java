package assignmentTwo;

public class BanquetHall {
	double calculateBaseCost(double baseBookingCost, double foodCost, double beverageCost, double tip) {
		return baseBookingCost + foodCost + beverageCost + tip;
	}

	double calculateTax(double baseCost) {
		double tax = .13;
		return baseCost * tax;
	}

	double calculateCost(int numberOfGuests, double baseCost) {
		double cess;
		if (numberOfGuests <= 40) {
			cess = .04;
		} else if (numberOfGuests <= 80) {
			cess = .08;
		} else if (numberOfGuests <= 150) {
			cess = .10;
		} else {
			cess = .125;
		}
		return cess * baseCost;
	}

	double calculateTheTotalCost(double baseCost, double tax, double cess) {
		return baseCost + tax + cess;
	}

}
