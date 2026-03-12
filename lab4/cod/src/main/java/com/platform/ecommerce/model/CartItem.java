package com.platform.ecommerce.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal unitPrice;

    public CartItem() {}

    public CartItem(Cart cart, Product product, int quantity) {
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
    }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Cart getCart() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Product getProduct() { throw new UnsupportedOperationException("Not implemented yet"); }
    public int getQuantity() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setQuantity(int quantity) { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getUnitPrice() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void increaseQuantity(int amount) { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getSubtotal() { throw new UnsupportedOperationException("Not implemented yet"); }
}
