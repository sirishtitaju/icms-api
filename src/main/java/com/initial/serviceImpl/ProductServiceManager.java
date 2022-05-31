package com.initial.serviceImpl;

import com.initial.services.ProductService;
import com.initial.model.Product;
import com.initial.repo.ProductRepo;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ProductServiceManager implements ProductService {
    @Inject
    private ProductRepo productRepo;


    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product findProductById(long Id) {
         return productRepo.findByProductId(Id);
    }
    @Override
    public void delete(long Id) {
        productRepo.deleteByProductId(Id);
    }


    public Product updateProduct(Product product) {
        return productRepo.update(product);
    }



    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();
    }
}
