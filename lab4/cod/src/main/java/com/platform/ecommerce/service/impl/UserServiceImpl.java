package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.User;
import com.platform.ecommerce.repository.UserRepository;
import com.platform.ecommerce.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<User> findById(Long id) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<User> findByEmail(String email) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<User> findAll() { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public User update(User user) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void deactivate(Long userId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void activate(Long userId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public boolean existsByEmail(String email) { throw new UnsupportedOperationException("Not implemented yet"); }
}
