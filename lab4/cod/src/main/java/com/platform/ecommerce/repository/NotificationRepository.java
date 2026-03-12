package com.platform.ecommerce.repository;

import com.platform.ecommerce.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByRecipientId(Long userId);
    List<Notification> findByRecipientIdAndSent(Long userId, boolean sent);
}
