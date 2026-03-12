package com.platform.ecommerce.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public Cart() {}

    public Cart(Client client) { this.client = client; }

    @PrePersist
    @PreUpdate
    protected void onUpdate() { throw new UnsupportedOperationException("Not implemented yet"); }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Client getClient() { throw new UnsupportedOperationException("Not implemented yet"); }
    public List<CartItem> getItems() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getUpdatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void addItem(Product product, int quantity) { throw new UnsupportedOperationException("Not implemented yet"); }
    public void removeItem(Long productId) { throw new UnsupportedOperationException("Not implemented yet"); }
    public void updateItemQuantity(Long productId, int quantity) { throw new UnsupportedOperationException("Not implemented yet"); }
    public void clear() { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getTotalPrice() { throw new UnsupportedOperationException("Not implemented yet"); }
    public int getTotalItemCount() { throw new UnsupportedOperationException("Not implemented yet"); }
    public boolean isEmpty() { throw new UnsupportedOperationException("Not implemented yet"); }
}
