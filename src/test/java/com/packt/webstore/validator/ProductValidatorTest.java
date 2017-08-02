package com.packt.webstore.validator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.packt.webstore.config.WebApplicationContextConfig;
import com.packt.webstore.domain.CartItem;
import com.packt.webstore.domain.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebApplicationContextConfig.class)
@WebAppConfiguration
public class ProductValidatorTest {
	
	
	 @Autowired
	 private ProductValidator productValidator;
	 
	 
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
