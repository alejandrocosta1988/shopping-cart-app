package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartTest {
	
	private Product productA;
	private Product productB;
	private CartItem cartItemA;
	private CartItem cartItemB;
	private Cart cart;
	
	@BeforeEach
	void prepareTest() {
		productA = new Product("2134A", "Test item A.", 39.99);
		productB = new Product("2134B", "Test item B.", 12.99);
		cartItemA = new CartItem(productA, 3);
		cartItemB = new CartItem(productB, 1);
		cart = new Cart();
	}
	
	@BeforeEach

	@Test
	void getCountReturnsZeroWhenThereIsNoItemInCart() {
		assertEquals(cart.getCount(), 0);
	}
	
	@Test
	void getCountReturnsTheNumberOfItemsInCartIfThereIsAtLeastOne() {
		
		cart.addItem(cartItemB);
		
		assertEquals(cart.getCount(), 1);
		
	}
	
	@Test
	void addItemDoesNotAddItemThatIsAlreadyInCart() {
		
		cart.addItem(cartItemA);
		cart.addItem(cartItemA);
		
		assertEquals(cart.getCount(), 1);
		
	}
	
	@Test
	void addItemIncreasesQuantityIfItemIsAlreadyInCart() {
		
		cart.addItem(cartItemA);
		cart.addItem(cartItemB);
		cart.addItem(cartItemB);
		
		assertEquals(cart.getTotalNumberOfItems(), 5);
		
	}
	
	@Test
	void updateQuantityUpdatesTheQuantityOfAnItem() {
		
		cart.addItem(cartItemA);
		cartItemA.setQuantity(1);
		cart.updateQuantity(cartItemA);
		
		assertEquals(cart.getTotalNumberOfItems(), 1);
		
	}
	
	@Test
	void removeItemDeletesTheItemFromCart() {
		
		cart.addItem(cartItemA);
		cart.addItem(cartItemB);
		cart.removeItem(cartItemA);
		
		assertEquals(cart.getTotalNumberOfItems(), 1);
		
	}
	
	@Test
	void removeAllItemsInCart() {
		
		cart.addItem(cartItemA);
		cart.addItem(cartItemB);
		
		cart.emptyCart();
		
		assertEquals(cart.getTotalNumberOfItems(), 0);
	}

}
