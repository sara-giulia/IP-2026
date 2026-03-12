package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Product;
import com.platform.ecommerce.model.enums.ProductStatus;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product addProduct(Product product);
    Optional<Product> findById(Long id);
    List<Product> findAll();
    List<Product> findByCategory(Long categoryId);
    List<Product> findBySeller(Long sellerId);
    List<Product> search(String keyword);
    Product update(Product product);
    void updateStatus(Long productId, ProductStatus status);
    void updateStock(Long productId, int quantity);
    void delete(Long productId);
}
