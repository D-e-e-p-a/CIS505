package Module_6;

import java.util.List;
import java.util.Scanner;

public class TestComposerApp {
	static Scanner sc = new Scanner(System.in);
	static boolean choice = true;
	static MemComposerDao mcDao = new MemComposerDao();

	public static void main(String[] args) {

		System.out.println("Welcome to the Composer App:");

		while (choice) {

			displayMenu();

		}

	}

	private static void displayMenu() {
		String menu = "1.View Composer" + '\n' + "2.Find Composer" + "\n" + "3.Add Composer" + '\n' + "4.Exit" + '\n';
		System.out.println(menu + '\n' + "Please Choose an Option:" + '\n');
		int input = sc.nextInt();

		switch (input) {

		case 1:

			List<Composer> displayList = mcDao.findall();
			System.out.println("--DISPLAYING COMPOSERS--");
			for (Composer c : displayList)
				System.out.println(c.toString());
			break;

		case 2:
			System.out.println("Enter the ID number:");
			Integer key = Integer.valueOf(sc.next());

			try {
				Composer composer = mcDao.findBy(key);
				System.out.println("--DISPLAYING COMPOSER--");
				System.out.println(composer.toString());

			} catch (Exception e) {

				System.out.println("ID not found, try again!" + '\n');
			}

			break;

		case 3:

			boolean exist =true;
			int id =0;

			do {
				System.out.println("Enter Composer ID:");
				id = sc.nextInt();
				sc.nextLine();
				Composer composer = mcDao.findBy(id);
				if (composer != null) {
					System.out.println("ID already exist, Try again!");
					}else {
						exist = false;
					}

			}while (exist);

			System.out.println("Enter Composer Name:");
			String name = sc.nextLine();

			System.out.println("Enter Genre:");
			String genre = sc.nextLine();

			Composer composer = new Composer(id, name, genre);
			mcDao.insert(composer);

			break;

		case 4:
			System.out.println("Thank you!");
			choice = false;
			break;

		default:
			System.out.println("Invalid Number");
			System.out.println();
			break;

		}

	}

}
