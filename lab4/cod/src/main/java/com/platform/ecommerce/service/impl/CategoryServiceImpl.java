package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Category;
import com.platform.ecommerce.repository.CategoryRepository;
import com.platform.ecommerce.service.CategoryService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(Category category) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Category> findById(Long id) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Category> findAll() { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Category> findRootCategories() { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Category> findSubCategories(Long parentId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Category update(Category category) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void delete(Long categoryId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
