package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {

	private Product product;
	
	@BeforeEach
	public void create_product() {
		product = new Product();
	}
	
	@Test
	void getPriceCurrencyFormatReturnsStringWithPriceInBrazilianFormat() {
		
		product.setPrice(12.99);
		assertEquals(product.getPriceCurrencyFormat(), "R$ 12,99");
		
	}

}
