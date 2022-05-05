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
			updateItemQuantity(cartItem);
		} else {
			items.add(cartItem);
		}
		
	}
	
	private boolean isItemAlreadyInCart(CartItem cartItem) {
		String productCode = cartItem.getProductCode();
		
		for (CartItem item : items) {
			String itemsCode = item.getProductCode();
			if (productCode.equals(itemsCode)) {
				return true;
			}
		}
		
		return false;
	}
	
	private void updateItemQuantity(CartItem cartItem) {
		
		int index = items.indexOf(cartItem);
		CartItem updatedItem = items.get(index);
		updatedItem.setQuantity(updatedItem.getQuantity() + 1);
		items.set(index, updatedItem);
		
	}

	public Integer getTotalNumberOfItems() {
		int total = 0;
		for (CartItem item : items) {
			total += item.getQuantity();
		}
		return total;
	}
	
}
