package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Review;
import com.platform.ecommerce.repository.ReviewRepository;
import com.platform.ecommerce.service.ReviewService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review addReview(Long clientId, Long productId, int rating, String comment) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Review> findById(Long id) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Review> findByProductId(Long productId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Review> findByClientId(Long clientId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Review update(Long reviewId, int rating, String comment) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void delete(Long reviewId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
