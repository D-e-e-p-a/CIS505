package Module_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class TransactionIO {

	private static String FILE_NAME = ".\\src\\Module_5\\expenses.txt";
	// private static String FILE_NAME = "expenses.txt";

	private static File file = new File(FILE_NAME);

	// writes the objects to the file using the output.print and output.println

	public static void bulkInsert(ArrayList<Transaction> transaction) throws IOException {

		PrintWriter output = null;

		if (file.exists()) {
			output = new PrintWriter(new FileOutputStream(file, true));

		} else {

			output = new PrintWriter(file);
		}

		for (Transaction tran : transaction) {

			output.print(tran.getDate() + " ");
			output.print(tran.getDescription() + " ");
			output.println(tran.getAmount());
		}

		output.close();

	}

	// return an ArrayList of transactions
	public static ArrayList<Transaction> findAll() throws IOException {

		ArrayList<Transaction> list = new ArrayList<>();

		Scanner input = new Scanner(file);
		// input.nextLine();

		while (input.hasNext()) {

			String date = input.next();
			String description = input.next();
			double amount = input.nextDouble();

			Transaction transaction = new Transaction(date, description, amount);
			list.add(transaction);

		}
		input.close();
		return list;
		
	}


}
