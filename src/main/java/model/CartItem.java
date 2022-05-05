package model;

import java.io.Serializable;
import java.text.NumberFormat;

public class CartItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private Product product;
	private int quantity;
	
	public CartItem() {}
	
	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public String getTotalCurrencyFormat() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getTotal());
	}
	
	public String getProductCode() {
		return product.getCode();
	}
	
	public double getTotal() {
		return quantity * product.getPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
