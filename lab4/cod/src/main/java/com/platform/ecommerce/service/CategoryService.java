package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category create(Category category);
    Optional<Category> findById(Long id);
    List<Category> findAll();
    List<Category> findRootCategories();
    List<Category> findSubCategories(Long parentId);
    Category update(Category category);
    void delete(Long categoryId);
}
