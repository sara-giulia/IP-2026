package com.platform.ecommerce.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(length = 500)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_category_id")
    private Category parentCategory;

    @OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL)
    private List<Category> subCategories;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category() {}

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getName() { return ""; }
    public void setName(String name) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getDescription() { return ""; }
    public void setDescription(String description) { throw new UnsupportedOperationException("Not implemented yet"); }
    public Category getParentCategory() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setParentCategory(Category parentCategory) { throw new UnsupportedOperationException("Not implemented yet"); }
    public List<Category> getSubCategories() { throw new UnsupportedOperationException("Not implemented yet"); }
    public List<Product> getProducts() { throw new UnsupportedOperationException("Not implemented yet"); }
    public boolean isRootCategory() { throw new UnsupportedOperationException("Not implemented yet"); }
}
