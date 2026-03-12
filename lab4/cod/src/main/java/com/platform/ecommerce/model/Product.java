package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.ProductStatus;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 2000)
    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer stockQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id", nullable = false)
    private Seller seller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductStatus status;

    @ElementCollection
    @CollectionTable(name = "product_images", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "image_url")
    private List<String> imageUrls;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Review> reviews;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public Product() {}

    public Product(String name, String description, BigDecimal price,
                   Integer stockQuantity, Seller seller, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.seller = seller;
        this.category = category;
        this.status = ProductStatus.PENDING_APPROVAL;
    }

    @PrePersist
    protected void onCreate() { throw new UnsupportedOperationException("Not implemented yet"); }

    @PreUpdate
    protected void onUpdate() { throw new UnsupportedOperationException("Not implemented yet"); }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getName() { return ""; }
    public void setName(String name) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getDescription() { return ""; }
    public void setDescription(String description) { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getPrice() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setPrice(BigDecimal price) { throw new UnsupportedOperationException("Not implemented yet"); }
    public Integer getStockQuantity() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setStockQuantity(Integer stockQuantity) { throw new UnsupportedOperationException("Not implemented yet"); }
    public Seller getSeller() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Category getCategory() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setCategory(Category category) { throw new UnsupportedOperationException("Not implemented yet"); }
    public ProductStatus getStatus() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setStatus(ProductStatus status) { throw new UnsupportedOperationException("Not implemented yet"); }
    public List<String> getImageUrls() { throw new UnsupportedOperationException("Not implemented yet"); }
    public List<Review> getReviews() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getCreatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getUpdatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public boolean isAvailable() { throw new UnsupportedOperationException("Not implemented yet"); }
    public boolean hasStock(int requestedQuantity) { throw new UnsupportedOperationException("Not implemented yet"); }
    public void decreaseStock(int quantity) { throw new UnsupportedOperationException("Not implemented yet"); }
    public void increaseStock(int quantity) { throw new UnsupportedOperationException("Not implemented yet"); }
    public double getAverageRating() { throw new UnsupportedOperationException("Not implemented yet"); }
}
