package Module_3;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Account {

	private double balance = 200.0;

	public Account() {

	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {

		balance = balance + amt;

	}

	public void withdraw(double amt) {
		if (balance >= amt) {
			balance = balance - amt;

		} else {
			System.out.println("Check the balance amount :" + getBalanceFormatted());
		}

	}

	public void menu() {
		System.out.println("Enter <D/d> for Deposite: ");
		System.out.println("Enter <W/w> for Withdraw: ");
		System.out.println("Enter <B/b> for Balance: ");

	}

	public String getTransactionDate() {

		LocalDate date1 = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		String date = date1.format(dtf);

		return date;
	}

	String getBalanceFormatted() {

		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return formatter.format(getBalance());

	}

	public void displayAccount() {

		String msg = "Balance as of " + getTransactionDate() + " is " + getBalanceFormatted();
		System.out.println(msg);

	}

}