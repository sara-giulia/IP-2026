package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.CatalogEntry;
import com.platform.ecommerce.repository.CatalogEntryRepository;
import com.platform.ecommerce.service.CatalogService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final CatalogEntryRepository catalogEntryRepository;

    public CatalogServiceImpl(CatalogEntryRepository catalogEntryRepository) {
        this.catalogEntryRepository = catalogEntryRepository;
    }

    @Override
    public List<CatalogEntry> findAll() { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<CatalogEntry> findAvailable() { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<CatalogEntry> findByCategory(String categoryName) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<CatalogEntry> search(String keyword) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<CatalogEntry> findByProductId(Long productId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public CatalogEntry syncFromProduct(Long productId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void markUnavailable(Long productId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
