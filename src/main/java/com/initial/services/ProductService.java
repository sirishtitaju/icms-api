package com.initial.services;


import com.initial.model.Product;

import java.util.List;

public interface ProductService {


    Product addProduct(Product product);

    Product findProductById(long key);

    Product updateProduct(Product product);

    void delete(long key);

    List<Product> findAll();



}
