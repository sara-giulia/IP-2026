package com.platform.ecommerce.repository;

import com.platform.ecommerce.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
    Optional<Delivery> findByOrderId(Long orderId);
    Optional<Delivery> findByTrackingNumber(String trackingNumber);
}
