package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Delivery;
import com.platform.ecommerce.model.enums.DeliveryStatus;
import com.platform.ecommerce.repository.DeliveryRepository;
import com.platform.ecommerce.service.DeliveryService;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    private final DeliveryRepository deliveryRepository;

    public DeliveryServiceImpl(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Override
    public Delivery createDelivery(Long orderId, String courierName) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Delivery> findByOrderId(Long orderId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Delivery> findByTrackingNumber(String trackingNumber) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Delivery updateStatus(Long deliveryId, DeliveryStatus status) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Delivery markAsShipped(Long deliveryId, String trackingNumber) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Delivery markAsDelivered(Long deliveryId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
