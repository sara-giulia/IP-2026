package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Payment;
import com.platform.ecommerce.repository.PaymentRepository;
import com.platform.ecommerce.service.PaymentService;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment processPayment(Long orderId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Payment> findByOrderId(Long orderId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Payment refund(Long paymentId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
