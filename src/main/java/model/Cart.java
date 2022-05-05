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
		
		if (isItemAlreadyInCart(cartItem)) {
			return;
		}
		
		items.add(cartItem);
		
	}
	
	private boolean isItemAlreadyInCart(CartItem cartItem) {
		String productCode = cartItem.getProduct().getCode();
		String itemsCode = "";
		
		for (CartItem item : items) {
			itemsCode = item.getProduct().getCode();
			if (productCode.equals(itemsCode)) {
				return true;
			}
		}
		
		return false;
	}
	
}
