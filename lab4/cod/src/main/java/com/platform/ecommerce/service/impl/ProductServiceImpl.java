package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Product;
import com.platform.ecommerce.model.enums.ProductStatus;
import com.platform.ecommerce.repository.ProductRepository;
import com.platform.ecommerce.service.ProductService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Product> findById(Long id) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Product> findAll() { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Product> findByCategory(Long categoryId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Product> findBySeller(Long sellerId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Product> search(String keyword) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Product update(Product product) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void updateStatus(Long productId, ProductStatus status) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void updateStock(Long productId, int quantity) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void delete(Long productId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
