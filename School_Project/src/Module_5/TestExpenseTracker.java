package Module_5;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String cString = "y";
		while (cString.equalsIgnoreCase("y")) {
			
			System.out.println("Welcome to the Expense Tracker" );

			int input = ValidatorIO.getInt(sc, menu());
			displayRequest(input);
			System.out.println("Continue (y/n)");
			cString = sc.next();
		}
		System.out.println("Program Terminated by the user...");

	}
	/* this method takes the input from the user 
	 * based on the selection 1,2, or 3 the method performs the operation
	 * to View or add transaction and to find the total expenses.  
	 * */
	
	

	private static void displayRequest(int input) {
		if (input == 1) {
			//1.View Transactions operation
			try {
				ArrayList<Transaction> transaction = TransactionIO.findAll();
				for (Transaction t : transaction)
					System.out.println(t.toString());
			} catch (IOException e) {
				System.out.println("Exception :" + e.getMessage());
			}

		} else if (input == 2) {
			//Add Transactions  operation
			String c = "y";
			ArrayList<Transaction> transaction = new ArrayList<>();

			while (c.equalsIgnoreCase("y")) {

				String description = ValidatorIO.getString(sc, "Enter the description:");
				double amount = ValidatorIO.getDouble(sc, "Enter the Amount:");
				Transaction t = new Transaction(description, amount);
				transaction.add(t);

				c = ValidatorIO.getString(sc, "Add another Transaction (y/n):");

			}

			try {
				TransactionIO.bulkInsert(transaction);
			} catch (IOException e) {
				System.out.println("Exception :" + e.getMessage());

			}

		} else if (input == 3) {
			//View Expenses operation
			double total = 0.0;
			try {
				ArrayList<Transaction> transaction = TransactionIO.findAll();
				for (Transaction t : transaction) {

					total = total + t.getAmount();

				}

			} catch (IOException e) {
				System.out.println("Exception :" + e.getMessage());
			}
			NumberFormat format = NumberFormat.getCurrencyInstance();
			System.out.println("Total Expense: " + format.format(total));

		} else {
			System.out.println("Invalid Options ,Try again.");
		}

	}

	private static String menu() {

		String message = "MENU OPTIONS" + '\n' + "1.View Transactions" + '\n' + "2.Add Transactions" + '\n'
				+ "3.View Expenses" + '\n' + '\n' + "Please choose an option";
		return message;
	}

}
