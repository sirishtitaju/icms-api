package com.initial.services;

import com.initial.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category addCategory(Category category);

    Optional<Category> getCategoryById(long id);

    List<Category> getAllCategory();

    void deleteCategoryById(long id);

    Category updateCategory(Category category);

    List<Category> getCategoryByProductId(long productId);
//    Category addCategory(Category category);
//
//    Optional<Category> findCategoryByName(String name);

    //for ContentModerator ?? methods

//    Category updateCategory(ProductService product);
//    void delete(Integer id);
//
//    Long createdAt(Long key);
//    Long deletedAt(Long key);
//
//    int getPriority(String name);
}
