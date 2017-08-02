package com.packt.webstore.domain;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class CarItemTest {

	private CartItem cartItem;

	@Before
	public void setup() {
		cartItem = new CartItem("1");
	}
	

	
	 @Test
	    public void testTotalPrice() {
	        //Arrange
	        Product iphone = new Product("P1234","iPhone 5s", new BigDecimal(500));
	        cartItem.setProduct(iphone);
	        cartItem.setQuantity(1);
	        cartItem.updateTotalPrice();

	        //Act
	        BigDecimal totalPrice = cartItem.getTotalPrice();
	        
	        System.out.println(totalPrice.toString());
	        System.out.println(iphone.getUnitPrice());

	        //Assert
	        Assert.assertEquals(iphone.getUnitPrice(), totalPrice);
	    }

}
