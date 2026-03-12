package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Seller;
import com.platform.ecommerce.repository.SellerRepository;
import com.platform.ecommerce.service.SellerService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SellerServiceImpl implements SellerService {

    private final SellerRepository sellerRepository;

    public SellerServiceImpl(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Override
    public Seller register(Seller seller) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Seller> findById(Long id) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Seller> findAll() { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Seller update(Seller seller) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void verify(Long sellerId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void unverify(Long sellerId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
