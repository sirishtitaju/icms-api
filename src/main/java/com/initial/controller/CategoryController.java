package com.initial.controller;

import com.initial.model.Category;
import com.initial.serviceImpl.CategoryServiceManager;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Optional;

@Controller("/category")
public class CategoryController {
    @Inject
    CategoryServiceManager categoryServiceManager;

    @Post()
    public Category addCategory(@Body Category category)
    {

        System.out.println(category);
        return categoryServiceManager.addCategory(category);
    }
    @Put()
    public Category updateCategory(@Body Category category)
    {
        return categoryServiceManager.updateCategory(category);
    }
    @Get("/{id}")
    public Optional<Category> getCategory(@PathVariable long id)
    {
        return categoryServiceManager.getCategoryById(id);
    }
    @Delete("/{id}")
    public boolean deleteCategory(@PathVariable long id)
    {
        categoryServiceManager.deleteCategoryById(id);
        return true;
    }

//    @Delete("{/Id}")
//    public boolean deleteCategory(@PathVariable Long Id)
//    {
//        System.out.println("category ko id"+Id);
//        categoryServiceManager.deleteCategoryById(Id);
//        return true;
//    }

    @Get("/all")
    public List<Category> getAllCategory()
    {
        System.out.println("category");
        return categoryServiceManager.getAllCategory();
    }

}
