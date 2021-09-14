package Module_3;

public class CustomerDB {
	public static Customer getCustomer(int id) {

		if (id == 1007) {
			return new Customer("Tom", "Num #1 main street", "Omaha", "60001");
		} else if (id == 1008) {
			return new Customer("Tim", "Num #2 main street", "Omaha", "60002");

		} else if (id == 1009) {
			return new Customer("Jack", "Num #3 main street", "Omaha", "60003");
		} else
			return new Customer("Jim", "Num #4 main street", "Omaha", "60004");

	}

}
