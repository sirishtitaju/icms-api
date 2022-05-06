package com.initial.repo;


import com.initial.model.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;


@Repository
public interface ProductRepo extends CrudRepository<Product,String> {

}
