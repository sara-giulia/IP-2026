package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Delivery;
import com.platform.ecommerce.model.enums.DeliveryStatus;
import java.util.Optional;

public interface DeliveryService {
    Delivery createDelivery(Long orderId, String courierName);
    Optional<Delivery> findByOrderId(Long orderId);
    Optional<Delivery> findByTrackingNumber(String trackingNumber);
    Delivery updateStatus(Long deliveryId, DeliveryStatus status);
    Delivery markAsShipped(Long deliveryId, String trackingNumber);
    Delivery markAsDelivered(Long deliveryId);
}
