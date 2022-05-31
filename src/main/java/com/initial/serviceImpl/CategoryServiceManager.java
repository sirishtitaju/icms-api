package com.initial.serviceImpl;

import com.initial.services.CategoryService;
import com.initial.model.Category;
import com.initial.repo.CategoryRepo;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
public class CategoryServiceManager implements CategoryService {

    @Inject
    private CategoryRepo categoryRepo;

    @Override
    public Optional<Category> getCategoryById(long id) {
//        return Optional.empty();
        return categoryRepo.findByCategoryId(id);
    }

    @Override
    public void deleteCategoryById(long id) {
        categoryRepo.deleteByCategoryId(id);
    }


    @Override
    public Category addCategory(Category category) {
        return categoryRepo.save(category);
    }



    @Override
    public List<Category> getAllCategory() {
        return (List<Category>) categoryRepo.findAll();
    }

    @Override
    public List<Category> getCategoryByProductId(long productId) {
        return (List<Category>) categoryRepo.findByProductId(productId);
    }


    @Override
    public Category updateCategory(Category category) {
        return categoryRepo.update(category);
    }


//    @Override
//    public Category addCategory(Category category) {
//        return categoryRepo.save(category);
//    }
//
//    @Override
//    public Optional<Category> findCategoryByName(String name) {
//        return Optional.ofNullable(categoryRepo.findByName(name));
//    }
//
////    @Override
////    public Category updateCategory(ProductService product) {
////        return categoryRepo.update(product);
////    }
//
//    @Override
//    public void delete(Integer id) {
//        categoryRepo.deleteById(id);
//    }
//
//    @Override
//    public Long createdAt(Long key) {
//        return null;
//    }
//
//    @Override
//    public Long deletedAt(Long key) {
//        return null;
//    }
//
//    @Override
//    public int getPriority(String name) {
//        return 0;
//    }
}
