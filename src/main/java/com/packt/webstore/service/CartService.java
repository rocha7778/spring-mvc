package com.packt.webstore.service;
import com.packt.webstore.domain.Cart;
import com.packt.webstore.dto.CartDto;

public interface CartService {
   
   public void create(CartDto cartDto);
   public Cart read(String cartId);
   public void update(String cartId, CartDto cartDto);
   public void delete(String id);
   public void addItem(String cartId, String productId);
   public void removeItem(String cartId, String productId);
   public Cart validate(String cartId);
   public void clearCart(String cartId);
}
