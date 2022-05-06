package model;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Objects;

/**
 * Armazena informações sobre cada produto disponível no website.
 * @author Alejandro Costa
 */
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	private String description;
	private double price;
	
	public Product() {
		this.code = "";
		this.description = "";
		this.price = 0;
	}
	
	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}

	
	public String getPriceCurrencyFormat() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, description, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(code, other.code) && Objects.equals(description, other.description)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
}
