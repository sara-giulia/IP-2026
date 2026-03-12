package com.platform.ecommerce.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reviews",
       uniqueConstraints = @UniqueConstraint(columnNames = {"client_id", "product_id"}))
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private int rating;

    @Column(length = 1000)
    private String comment;

    @Column(nullable = false)
    private boolean verified;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public Review() {}

    public Review(Client client, Product product, int rating, String comment) {
        this.client = client;
        this.product = product;
        this.rating = rating;
        this.comment = comment;
        this.verified = false;
    }

    @PrePersist
    protected void onCreate() { throw new UnsupportedOperationException("Not implemented yet"); }

    @PreUpdate
    protected void onUpdate() { throw new UnsupportedOperationException("Not implemented yet"); }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Client getClient() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Product getProduct() { throw new UnsupportedOperationException("Not implemented yet"); }
    public int getRating() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setRating(int rating) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getComment() { return ""; }
    public void setComment(String comment) { throw new UnsupportedOperationException("Not implemented yet"); }
    public boolean isVerified() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setVerified(boolean verified) { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getCreatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getUpdatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
}
