package com.platform.ecommerce.repository;

import com.platform.ecommerce.model.CatalogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CatalogEntryRepository extends JpaRepository<CatalogEntry, Long> {
    Optional<CatalogEntry> findByProductId(Long productId);
    List<CatalogEntry> findByAvailableTrue();
    List<CatalogEntry> findByCategoryName(String categoryName);
    List<CatalogEntry> findByNameContainingIgnoreCaseAndAvailableTrue(String keyword);
}
