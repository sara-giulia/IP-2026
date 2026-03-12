package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Order;
import com.platform.ecommerce.model.enums.OrderStatus;
import com.platform.ecommerce.model.enums.PaymentMethod;
import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order placeOrder(Long clientId, Long addressId, PaymentMethod paymentMethod);
    Optional<Order> findById(Long id);
    Optional<Order> findByOrderNumber(String orderNumber);
    List<Order> findByClientId(Long clientId);
    List<Order> findBySellerId(Long sellerId);
    List<Order> findAll();
    Order updateStatus(Long orderId, OrderStatus status);
    Order cancelOrder(Long orderId);
}
