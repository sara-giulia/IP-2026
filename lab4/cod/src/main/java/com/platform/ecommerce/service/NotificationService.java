package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Notification;
import com.platform.ecommerce.model.enums.NotificationType;

public interface NotificationService {
    void sendOrderConfirmation(Long orderId);
    void sendPaymentConfirmation(Long paymentId);
    void sendShippingUpdate(Long deliveryId);
    void sendDeliveryConfirmation(Long deliveryId);
    Notification send(Long userId, NotificationType type, String subject, String message);
}
