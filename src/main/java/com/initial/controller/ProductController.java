package com.initial.controller;


import com.initial.model.Product;
import com.initial.serviceImpl.ProductServiceManager;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/product")
public class ProductController {

    @Inject
    ProductServiceManager productServiceManager;


    @Post()
    public Product addProduct(@Body Product product)
    {
        System.out.println(product);
        return productServiceManager.addProduct(product);
    }

    @Put()
    public Product updateProduct(@Body Product product)
    {
        return productServiceManager.updateProduct(product);
    }


    @Get("/{name}")
    public Product findProduct(@PathVariable long name)
    {
        return productServiceManager.findProductById(name);
    }
    @Get("/all")
    public List<Product> findAll()
    {
        return productServiceManager.findAll();
    }
    @Delete("/{longId}")
    public boolean delete(@PathVariable long longId)
    {
         productServiceManager.delete(longId);
         return true;
    }


}
