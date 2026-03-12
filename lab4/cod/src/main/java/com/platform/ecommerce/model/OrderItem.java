package com.platform.ecommerce.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal unitPrice;

    public OrderItem() {}

    public OrderItem(Product product, int quantity, BigDecimal unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public static OrderItem fromCartItem(CartItem cartItem) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Order getOrder() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setOrder(Order order) { throw new UnsupportedOperationException("Not implemented yet"); }
    public Product getProduct() { throw new UnsupportedOperationException("Not implemented yet"); }
    public int getQuantity() { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getUnitPrice() { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getSubtotal() { throw new UnsupportedOperationException("Not implemented yet"); }
}
