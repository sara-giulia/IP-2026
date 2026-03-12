package com.platform.ecommerce.service;

import com.platform.ecommerce.model.CatalogEntry;
import java.util.List;
import java.util.Optional;

public interface CatalogService {
    List<CatalogEntry> findAll();
    List<CatalogEntry> findAvailable();
    List<CatalogEntry> findByCategory(String categoryName);
    List<CatalogEntry> search(String keyword);
    Optional<CatalogEntry> findByProductId(Long productId);
    CatalogEntry syncFromProduct(Long productId);
    void markUnavailable(Long productId);
}
