package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Order;
import com.platform.ecommerce.model.enums.OrderStatus;
import com.platform.ecommerce.model.enums.PaymentMethod;
import com.platform.ecommerce.repository.OrderRepository;
import com.platform.ecommerce.service.OrderService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order placeOrder(Long clientId, Long addressId, PaymentMethod paymentMethod) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Order> findById(Long id) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Order> findByOrderNumber(String orderNumber) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Order> findByClientId(Long clientId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Order> findBySellerId(Long sellerId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Order> findAll() { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Order updateStatus(Long orderId, OrderStatus status) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Order cancelOrder(Long orderId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
