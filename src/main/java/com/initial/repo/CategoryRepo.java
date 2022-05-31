package com.initial.repo;


import com.initial.model.Category;
import com.initial.model.Category;
import com.initial.model.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CategoryRepo extends CrudRepository<Category,Long> {
    Optional<Category> findByCategoryId(long id);

    void deleteByCategoryId(long id);

    List<Category> findByProductId(long productId);


    //Category findByName(String CategoryName);
//
//
//    Category save(Category Category);
//
//    void deleteByName(int id);
//
//    List<Category> findAll();
//
//    void updateCategory(Long id, Category Category);
}
