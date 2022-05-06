package com.initial.repo;


import com.initial.model.Article;
import com.initial.model.Author;
import com.initial.model.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepo extends CrudRepository<Product,String> {


}
