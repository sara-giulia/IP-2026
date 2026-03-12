package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Notification;
import com.platform.ecommerce.model.enums.NotificationType;
import com.platform.ecommerce.repository.NotificationRepository;
import com.platform.ecommerce.service.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public void sendOrderConfirmation(Long orderId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void sendPaymentConfirmation(Long paymentId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void sendShippingUpdate(Long deliveryId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void sendDeliveryConfirmation(Long deliveryId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Notification send(Long userId, NotificationType type, String subject, String message) { throw new UnsupportedOperationException("Not implemented yet"); }
}
