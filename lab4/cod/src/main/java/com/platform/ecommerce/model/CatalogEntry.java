package com.platform.ecommerce.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Read-optimised view of a Product exposed in the Storefront / Catalog.
 * Populated via events or a scheduled sync from the Product aggregate.
 */
@Entity
@Table(name = "catalog_entries")
public class CatalogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long productId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 2000)
    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(nullable = false)
    private String categoryName;

    @Column(nullable = false)
    private String sellerStoreName;

    @Column(nullable = false)
    private boolean available;

    private String thumbnailUrl;

    private Double averageRating;

    @Column(nullable = false)
    private LocalDateTime lastSyncedAt;

    public CatalogEntry() {}

    public CatalogEntry(Long productId, String name, String description,
                        BigDecimal price, String categoryName, String sellerStoreName) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryName = categoryName;
        this.sellerStoreName = sellerStoreName;
        this.available = true;
    }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Long getProductId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getName() { return ""; }
    public void setName(String name) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getDescription() { return ""; }
    public void setDescription(String description) { throw new UnsupportedOperationException("Not implemented yet"); }
    public BigDecimal getPrice() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setPrice(BigDecimal price) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getCategoryName() { return ""; }
    public void setCategoryName(String categoryName) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getSellerStoreName() { return ""; }
    public void setSellerStoreName(String sellerStoreName) { throw new UnsupportedOperationException("Not implemented yet"); }
    public boolean isAvailable() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setAvailable(boolean available) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getThumbnailUrl() { return ""; }
    public void setThumbnailUrl(String thumbnailUrl) { throw new UnsupportedOperationException("Not implemented yet"); }
    public Double getAverageRating() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setAverageRating(Double averageRating) { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getLastSyncedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setLastSyncedAt(LocalDateTime lastSyncedAt) { throw new UnsupportedOperationException("Not implemented yet"); }
}
