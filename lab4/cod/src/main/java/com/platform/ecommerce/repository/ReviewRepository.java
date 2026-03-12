package com.platform.ecommerce.repository;

import com.platform.ecommerce.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByProductId(Long productId);
    List<Review> findByClientId(Long clientId);
    Optional<Review> findByClientIdAndProductId(Long clientId, Long productId);
    boolean existsByClientIdAndProductId(Long clientId, Long productId);
}
