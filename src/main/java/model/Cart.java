package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<CartItem> items;
	
	public Cart() {
		items = new ArrayList<>();
	}
	
	public ArrayList<CartItem> getItems() {
		return items;
	}

	public int getCount() {
		return items.size();
	}

	public void addItem(CartItem cartItem) {
		
		String productCode = cartItem.getProduct().getCode();
		
		for (CartItem item : items) {
			String existentCode = item.getProduct().getCode();
			if (productCode.equals(existentCode)) {
				return;
			}
		}
		
		items.add(cartItem);
		
	}
	
}
