package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Payment;
import java.util.Optional;

public interface PaymentService {
    Payment processPayment(Long orderId);
    Optional<Payment> findByOrderId(Long orderId);
    Payment refund(Long paymentId);
}
