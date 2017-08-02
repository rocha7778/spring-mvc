package com.packt.webstore.service;

import com.packt.webstore.domain.Order;

public interface OrderService {
   public Long saveOrder(Order order);
}
