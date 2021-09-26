package Module_4;

import java.util.Scanner;

public class TestBowlingShopApp {
	static Scanner sc = new Scanner(System.in);
	static boolean flag = true;
	static GenericQueue<Product> product = null;
	// static String input;

	public static void main(String[] args) {
		System.out.println("Welcome to the Bowling shop Product List");

		do {

			displayMenu();

		} while (flag);

		System.out.println("Thank you!");

	}

	// utility Methods

	static void displayMenu() {

		String message = "1.<b> Bowling Balls" + '\n' + "2.<a> Bowling Bags" + '\n' + "3.<s> Bowling Shoes" + '\n'
				+ "4.<x> To Exit";

		System.out.println("Menu Option" + '\n' + message);

		// input = sc.next();
		makeChoice(sc.next());

	}

	static void makeChoice(String input) {

		if (input.equalsIgnoreCase("x")) {
			flag = false;
		} else {
			product = ProductDB.getProduct(input);
			if (product == null) {
				System.out.println(input + " - Invalid input, Try again!");
			}else {
				displayList();
			}

		}

	}

	static void displayList() {
		System.out.println("--Product Listing--");
		while (product != null && product.size() > 0) {
			System.out.println(product.dequeue().toString());
		}

	}

}
