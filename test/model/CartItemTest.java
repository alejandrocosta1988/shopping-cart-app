package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CartItemTest {

	Product product;
	CartItem cartItem;
	
	@Test
	void getTotalReturnsTheMultiplicationOfQuantityAndProductsPrice() {
		
		product = new Product();
		product.setPrice(33.45);
		cartItem = new CartItem();
		cartItem.setProduct(product);
		cartItem.setQuantity(3);
		
		assertEquals(cartItem.getTotal(), cartItem.getQuantity() * cartItem.getProduct().getPrice());
		
	}

}
