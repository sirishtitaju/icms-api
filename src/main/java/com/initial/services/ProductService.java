package com.initial.services;


import com.initial.model.Product;

import java.util.Optional;

public interface ProductService {


    Product addProduct(Product product);

    Optional<Product> findProductByName(String name);

    Optional<Product> findProductByKey(String key);

    Product updateProduct(Product product);

    void delete(String key);



}
