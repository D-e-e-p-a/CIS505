package Module_3;

import java.util.Scanner;

public class TestCustomerAccountApp {

	static Customer customer;
	static Account act = new Account();
	static String choice = "y";
	static Scanner sc = new Scanner(System.in);// scanner variable to get the system inputs.

	public static void main(String[] args) {

		System.out.println("Welcome to the sports Team App" + '\n');

		enterCustomerId();

		do {
			displayMenu();
			System.out.println("Continue : Y/N ");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("Y"));

		displayCustDetails();
		System.out.println("Thank you!");

	}

	// utility methods

	private static void displayCustDetails() {
		customer.displayCustomerInfo();
		act.displayAccount();

	}

	private static void displayMenu() {

		double amt = 0.0;

		act.menu();
		String inputString = sc.next();

		if (inputString.equalsIgnoreCase("D")) {

			System.out.println("Enter the Deposite Amount: ");
			amt = sc.nextDouble();
			if (amt <= 0) {
				System.out.println("Error: Invalid Amount ");
			} else {
				act.deposit(amt);
			}

		} else if (inputString.equalsIgnoreCase("W")) {
			System.out.println("Enter the Withdraw Amount: ");
			amt = sc.nextDouble();
			if (amt <= 0) {
				System.out.println("Error: Invalid Amount ");
			} else {
				act.withdraw(amt);
			}

		} else if (inputString.equalsIgnoreCase("b")) {
			act.getBalance();

		} else {
			System.out.println("Error: Invalid Option");
		}

	}

	private static void enterCustomerId() {
		System.out.println("Enter the customer ID :");
		System.out.println("Ex: 1007 ,1008, 1009 :");
		int id = sc.nextInt();
		customer = CustomerDB.getCustomer(id);

	}

}

/*
 * 2. Display the account menu using the accounts displayMenu method.
 * 
 */