package com.imperia.ecommerce.controller;

import com.imperia.ecommerce.dto.CategoryDto;
import com.imperia.ecommerce.model.Category;
import com.imperia.ecommerce.model.User;
import com.imperia.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Manage all the category related function
 * Created by Kithmal on 12/11/17.
 */
@RequestMapping("/category-mgt")
@RestController
public class CategoryManagement {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Category saveUser(CategoryDto categoryDto) {

        Category category = new Category();
        category.setStatus(category.getStatus());
        category.setCategoryName(category.getCategoryName());
        category.setDescription(category.getDescription());
        category.setMainCategory(category.getMainCategory());


        Category exCategory = categoryRepository.save(category);
        return exCategory;

    }




}
