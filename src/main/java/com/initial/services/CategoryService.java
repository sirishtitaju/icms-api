package com.initial.services;

import com.initial.model.Category;

import java.util.Optional;

public interface CategoryService {
    Category addCategory(Category category);

    Optional<Category> findCategoryByName(String name);

    //for ContentModerator ?? methods

//    Category updateCategory(ProductService product);
    void delete(String name);

    Long createdAt(Long key);
    Long deletedAt(Long key);

    int getPriority(String name);
}
