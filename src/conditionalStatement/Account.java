package conditionalStatement;

public class Account {

	double balanceAmount;

	int withdrawAmount;

	int overDraftAmount;

	int pinNumber;

	int pinNumberEntered;

//	void atmWithdrawal() {
//		if (balanceAmount >= withdrawAmount || overDraftAmount >=withdrawAmount) {
//			System.out.println("Customer can withdraw cash");
//		}
//		else {
//			System.out.println("Insufficient Funds");
//		}
//	}
	void validatePinAndWithdrawCash() {
		if (pinNumberEntered == pinNumber) {
			if (balanceAmount >= withdrawAmount || overDraftAmount >= withdrawAmount) {
				System.out.println("Customer can withdraw cash");
			} else {
				System.out.println("Insufficient Funds");
			}
		} else {
			System.out.println("Pin is not correct");
		}

	}
}
