package com.platform.ecommerce.service;

import com.platform.ecommerce.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User register(User user);
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
    List<User> findAll();
    User update(User user);
    void deactivate(Long userId);
    void activate(Long userId);
    boolean existsByEmail(String email);
}
