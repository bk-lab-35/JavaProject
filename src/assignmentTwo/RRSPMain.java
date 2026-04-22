package assignmentTwo;

public class RRSPMain {

	public static void main(String[] args) {
		RRSP rrsp = new RRSP ();
		double interest = rrsp.calculateRRSP(1000, 6);
		System.out.println("Total Interest: "+interest);

	}

}
