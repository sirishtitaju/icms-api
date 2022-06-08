package com.initial.controller;

import com.initial.model.Category;
import com.initial.model.Product;
import com.initial.serviceImpl.CategoryServiceManager;
import com.initial.serviceImpl.ProductServiceManager;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;

import java.util.List;

/***
 User
 ***/
@Controller("/article")
public class SvelteController {

    @Inject
    private ProductServiceManager productServiceManager;
    @Inject
    private CategoryServiceManager categoryServiceManager;



    @Get("/onClick")
    public List<Product> getProductsAndCategory()
    {

return   productServiceManager.findAll();

    }


    @Get("/onSelect/{productId}")
    public List<Category> getCategoryFromProductId(@PathVariable long productId)
    {
        System.out.println(productId);
        return categoryServiceManager.getCategoryByProductId(productId);

    }

}
