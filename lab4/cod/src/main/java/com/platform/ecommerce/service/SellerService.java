package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Seller;
import java.util.List;
import java.util.Optional;

public interface SellerService {
    Seller register(Seller seller);
    Optional<Seller> findById(Long id);
    List<Seller> findAll();
    Seller update(Seller seller);
    void verify(Long sellerId);
    void unverify(Long sellerId);
}
