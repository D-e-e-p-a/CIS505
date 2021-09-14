package Module_3;

public class Customer {

	// private Instance variables

	private String name;
	private String address;
	private String city;
	private String zipCode;

	// no argument constructor
	public Customer() {
	}

	public Customer(String name, String address, String city, String zipCode) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.zipCode = zipCode;
	}

	// getters method for the instance variables

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void displayCustomerInfo() {

		String message = "Name :" + getName() + '\n' + "Address :" + getAddress() + '\n' + "City : " + getCity() + '\n'
				+ "Zip :" + getZipCode();

		System.out.println(message);

	}

}
