package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.DeliveryStatus;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false, unique = true)
    private Order order;

    @Column(unique = true)
    private String trackingNumber;

    @Column(nullable = false)
    private String courierName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeliveryStatus status;

    private LocalDate estimatedDeliveryDate;
    private LocalDateTime shippedAt;
    private LocalDateTime deliveredAt;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public Delivery() {}

    public Delivery(Order order, String courierName) {
        this.order = order;
        this.courierName = courierName;
        this.status = DeliveryStatus.NOT_SHIPPED;
    }

    @PrePersist
    protected void onCreate() { throw new UnsupportedOperationException("Not implemented yet"); }

    @PreUpdate
    protected void onUpdate() { throw new UnsupportedOperationException("Not implemented yet"); }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Order getOrder() { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getTrackingNumber() { return ""; }
    public void setTrackingNumber(String trackingNumber) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getCourierName() { return ""; }
    public void setCourierName(String courierName) { throw new UnsupportedOperationException("Not implemented yet"); }
    public DeliveryStatus getStatus() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setStatus(DeliveryStatus status) { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDate getEstimatedDeliveryDate() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setEstimatedDeliveryDate(LocalDate date) { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getShippedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getDeliveredAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getCreatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getUpdatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void markAsShipped(String trackingNumber, LocalDate estimatedDeliveryDate) { throw new UnsupportedOperationException("Not implemented yet"); }
    public void markAsDelivered() { throw new UnsupportedOperationException("Not implemented yet"); }
}
