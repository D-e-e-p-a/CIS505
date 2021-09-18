package Module_4;

public class Product {
	private String code = "";
	private String description = "";// product description
	private double price = 0.0;

	/*
	 * public Product() { }
	 */// no argument constructors

	@Override
	public String toString() {

		String message = "product Code : " + code + '\n' + "Product Description :" + description + '\n'
				+ "Product Price :" + price;
		return message;
	}

	// getters

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}
	// setters

	public void setCode(String code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
