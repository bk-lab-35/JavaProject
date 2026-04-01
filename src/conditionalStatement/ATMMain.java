package conditionalStatement;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Account a = new Account();

		Scanner sc = new Scanner(System.in);

		a.balanceAmount = 7850.45;
		a.overDraftAmount = 10000;
		a.pinNumber = 1234;
		System.out.println("Enter the pin number:");
		a.pinNumberEntered = sc.nextInt();

		System.out.println("Enter amount to withdraw:");
		a.withdrawAmount = sc.nextInt();

		a.validatePinAndWithdrawCash();

//		a.atmWithdrawal();

	}

}
