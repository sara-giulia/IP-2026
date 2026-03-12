package com.platform.ecommerce.repository;

import com.platform.ecommerce.model.Product;
import com.platform.ecommerce.model.enums.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findBySellerId(Long sellerId);
    List<Product> findByStatus(ProductStatus status);
    List<Product> findByNameContainingIgnoreCaseAndStatus(String keyword, ProductStatus status);
}
