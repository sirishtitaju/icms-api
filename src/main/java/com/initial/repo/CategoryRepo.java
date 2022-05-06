package com.initial.repo;


import com.initial.model.Category;
import com.initial.model.Category;
import com.initial.model.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CategoryRepo extends CrudRepository<Category,String> {

    Category findByName(String CategoryName);


    Category save(Category Category);

    void deleteById(Long id);

    List<Category> findAll();

    void updateCategory(Long id, Category Category);
}
