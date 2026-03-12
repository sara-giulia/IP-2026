package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.OrderStatus;
import com.platform.ecommerce.model.enums.PaymentMethod;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String orderNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentMethod paymentMethod;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal shippingCost;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "street",     column = @Column(name = "shipping_street")),
        @AttributeOverride(name = "city",       column = @Column(name = "shipping_city")),
        @AttributeOverride(name = "county",     column = @Column(name = "shipping_county")),
        @AttributeOverride(name = "postalCode", column = @Column(name = "shipping_postal_code")),
        @AttributeOverride(name = "country",    column = @Column(name = "shipping_country"))
    })
    private ShippingAddress shippingAddress;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Delivery delivery;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public Order() {}

    public Order(String orderNumber, Client client, PaymentMethod paymentMethod,
                 BigDecimal shippingCost, ShippingAddress shippingAddress) {
        this.orderNumber = orderNumber;
        this.client = client;
        this.paymentMethod = paymentMethod;
        this.shippingCost = shippingCost;
        this.shippingAddress = shippingAddress;
        this.status = OrderStatus.PENDING;
    }

    @PrePersist
    protected void onCreate() { throw new UnsupportedOperationException("Not implemented yet"); }

    @PreUpdate
    protected void onUpdate() { throw new UnsupportedOperationException("Not implemented yet"); }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getOrderNumber() { return ""; }
    public Client getClient() { throw new UnsupportedOperationException("Not implemented yet"); }
    public List<OrderItem> getItems() { throw new UnsupportedOperationException("Not implemented yet"); }
    public OrderStatus getStatus() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setStatus(OrderStatus status) { throw new UnsupportedOperationException("Not implemented yet"); }
    public PaymentMethod getPaymentMethod() { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getTotalAmount() { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getShippingCost() { throw new UnsupportedOperationException("Not implemented yet"); }
    public ShippingAddress getShippingAddress() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Payment getPayment() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setPayment(Payment payment) { throw new UnsupportedOperationException("Not implemented yet"); }
    public Delivery getDelivery() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setDelivery(Delivery delivery) { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getCreatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getUpdatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void addItem(OrderItem item) { throw new UnsupportedOperationException("Not implemented yet"); }
    public void recalculateTotalAmount() { throw new UnsupportedOperationException("Not implemented yet"); }
    public boolean canBeCancelled() { throw new UnsupportedOperationException("Not implemented yet"); }
}
