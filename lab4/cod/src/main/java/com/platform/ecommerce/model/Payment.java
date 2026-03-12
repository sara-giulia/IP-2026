package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.PaymentMethod;
import com.platform.ecommerce.model.enums.PaymentStatus;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false, unique = true)
    private Order order;

    @Column(unique = true)
    private String externalTransactionId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentMethod method;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus status;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    private LocalDateTime processedAt;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public Payment() {}

    public Payment(Order order, PaymentMethod method, BigDecimal amount) {
        this.order = order;
        this.method = method;
        this.amount = amount;
        this.status = PaymentStatus.PENDING;
    }

    @PrePersist
    protected void onCreate() { throw new UnsupportedOperationException("Not implemented yet"); }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Order getOrder() { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getExternalTransactionId() { return ""; }
    public void setExternalTransactionId(String externalTransactionId) { throw new UnsupportedOperationException("Not implemented yet"); }
    public PaymentMethod getMethod() { throw new UnsupportedOperationException("Not implemented yet"); }
    public PaymentStatus getStatus() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setStatus(PaymentStatus status) { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getAmount() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getProcessedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getCreatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void markAsCompleted(String transactionId) { throw new UnsupportedOperationException("Not implemented yet"); }
    public void markAsFailed() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void markAsRefunded() { throw new UnsupportedOperationException("Not implemented yet"); }
}
