package Module_5;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {

	private String date = dtFormatter.format(LocalDate.now());
	private String description = "";
	private double amount = 0.0;

	static DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

	Transaction() { // default constructor

	}

	Transaction(String date, String description, double amount) { // value constructor
		this.date = date;
		this.description = description;
		this.amount = amount;
	}

	Transaction(String description, double amount) { // value constructor

		this.description = description;
		this.amount = amount;
	}

	@Override// overridden String method
	public String toString() {
		String messageString = "Date :" + getDate() + '\n' + "Description : " + getDescription() + '\n' + "Amount: "
				+ getformattedAmount() + '\n';

		return messageString;

	}

	//date generated using the LocaDate class
	public String getDate() {
		return dtFormatter.format(LocalDate.now());
	}

	public String getDescription() {
		return description;
	}

	//Formatted Amount returns the currency formatted string
	public String getformattedAmount() {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		return format.format(amount);
	}
	
	//this method returns the amount in the double value
	public double getAmount() {
		
		return amount;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
