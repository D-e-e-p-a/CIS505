package Module_4;

import java.text.NumberFormat;
import java.util.Currency;

public class Product {
	private String code = "";
	private String description = "";// product description
	private double price = 0.0;

	
	  public Product() { 
		  
	  }
	 // no argument constructors

	@Override
	public String toString() {
		NumberFormat f=NumberFormat.getCurrencyInstance();

		String message = "product Code : " + code + '\n' + "Product Description :" + description + '\n'
				+ "Product Price :" + f.format(price);
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
