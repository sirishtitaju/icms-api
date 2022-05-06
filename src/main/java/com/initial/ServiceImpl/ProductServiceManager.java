package com.initial.ServiceImpl;

import com.initial.services.ProductService;
import com.initial.model.Product;
import com.initial.repo.ProductRepo;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.Optional;

@Singleton
public class ProductServiceManager implements ProductService {
    @Inject
    private ProductRepo productRepo;


    @Override
    public Product addProduct(Product product) {

        return productRepo.save(product);
    }

    @Override
    public Optional<Product> findProductByName(String name) {
        return productRepo.findById(name);
    }

    @Override
    public Optional<Product> findProductByKey(String key) {
        return productRepo.findById(key);
    }

    public Product updateProduct(Product product) {
        return productRepo.update(product);
    }

    @Override
    public void delete(String key) {
        productRepo.deleteById(key);
    }
}
