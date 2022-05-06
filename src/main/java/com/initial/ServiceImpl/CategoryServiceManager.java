package com.initial.ServiceImpl;

import com.initial.services.CategoryService;
import com.initial.model.Category;
import com.initial.repo.CategoryRepo;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.Optional;

@Singleton
public class CategoryServiceManager implements CategoryService {

    @Inject
    private CategoryRepo categoryRepo;


    @Override
    public Category addCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Optional<Category> findCategoryByName(String name) {
        return categoryRepo.findById(name);
    }

//    @Override
//    public Category updateCategory(ProductService product) {
//        return categoryRepo.update(product);
//    }

    @Override
    public void delete(String name) {
        categoryRepo.deleteById(name);
    }

    @Override
    public Long createdAt(Long key) {
        return null;
    }

    @Override
    public Long deletedAt(Long key) {
        return null;
    }

    @Override
    public int getPriority(String name) {
        return 0;
    }
}
