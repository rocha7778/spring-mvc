package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Cart;
import com.packt.webstore.dto.CartDto;

public interface CartRepository {

   public void create(CartDto cartDto);
   public Cart read(String id);
   public void update(String id, CartDto cartDto);
   public void delete(String id);
   public void addItem(String cartId, String productId);
   public void removeItem(String cartId, String productId);
}
