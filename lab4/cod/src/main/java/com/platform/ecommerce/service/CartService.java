package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Cart;

public interface CartService {
    Cart getCartByClientId(Long clientId);
    Cart addItem(Long clientId, Long productId, int quantity);
    Cart removeItem(Long clientId, Long productId);
    Cart updateItemQuantity(Long clientId, Long productId, int quantity);
    Cart clearCart(Long clientId);
}
