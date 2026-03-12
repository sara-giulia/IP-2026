package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Cart;
import com.platform.ecommerce.repository.CartRepository;
import com.platform.ecommerce.service.CartService;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart getCartByClientId(Long clientId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Cart addItem(Long clientId, Long productId, int quantity) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Cart removeItem(Long clientId, Long productId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Cart updateItemQuantity(Long clientId, Long productId, int quantity) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Cart clearCart(Long clientId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
