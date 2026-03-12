package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Review;
import java.util.List;
import java.util.Optional;

public interface ReviewService {
    Review addReview(Long clientId, Long productId, int rating, String comment);
    Optional<Review> findById(Long id);
    List<Review> findByProductId(Long productId);
    List<Review> findByClientId(Long clientId);
    Review update(Long reviewId, int rating, String comment);
    void delete(Long reviewId);
}
