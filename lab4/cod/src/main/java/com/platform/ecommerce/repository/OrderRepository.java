package com.platform.ecommerce.repository;

import com.platform.ecommerce.model.Order;
import com.platform.ecommerce.model.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByOrderNumber(String orderNumber);
    List<Order> findByClientId(Long clientId);
    List<Order> findByItemsProductSellerId(Long sellerId);
    List<Order> findByStatus(OrderStatus status);
}
