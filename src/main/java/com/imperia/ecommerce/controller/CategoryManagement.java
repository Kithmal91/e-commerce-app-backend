package com.imperia.ecommerce.controller;

import com.imperia.ecommerce.common.WSPath;
import com.imperia.ecommerce.dto.response.CategoryResponse;
import com.imperia.ecommerce.entity.Category;
import com.imperia.ecommerce.dto.CategoryDto;
import com.imperia.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Manage all the category related function
 * Created by Kithmal on 12/11/17.
 */
@RequestMapping(WSPath.CATEGORY)
@RestController
public class CategoryManagement {

    @Autowired
    CategoryRepository categoryRepository;

    /**
     * Save CategoryDto
     *
     * @param categoryDto
     * @return
     */
    @RequestMapping(path = WSPath.CATEGORY_SAVE, method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Category> save(@RequestBody CategoryDto categoryDto) {

        Category category = categoryRepository.findOne(categoryDto.getId());

        if(null != category){
            category.setStatus(categoryDto.getStatus());
            category.setCategoryName(categoryDto.getCategoryName());
            category.setDescription(categoryDto.getDescription());
            category.setMainCategory(categoryDto.getMainCategory());

        } else {
            category = new Category();
            category.setStatus(categoryDto.getStatus());
            category.setCategoryName(categoryDto.getCategoryName());
            category.setDescription(categoryDto.getDescription());
            category.setMainCategory(categoryDto.getMainCategory());
        }

        Category exCategory = categoryRepository.save(category);
        return ResponseEntity.ok(exCategory);

    }

    /**
     * Get all category
     *
     * @return
     */
    @RequestMapping(path = WSPath.CATEGORY_GET_ALL, method = RequestMethod.GET)
    @ResponseBody
    public CategoryResponse getAll() {

        Iterable<Category> categoryList = categoryRepository.findAll();
        List<Category> list = new ArrayList<>();
        categoryList.forEach(list::add);
        CategoryResponse response = new CategoryResponse();

        List<CategoryDto> dtos = new ArrayList<>();

        for(Category category : list){
            CategoryDto dto = new CategoryDto();
            dto.setStatus(category.getStatus());
            dto.setCategoryName(category.getCategoryName());
            dto.setDescription(category.getDescription());
            dto.setMainCategory(category.getMainCategory());
            dto.setId(category.getId());
            dtos.add(dto);
        }

        response.setDtos(dtos);
        return response;
    }

    /**
     * Get category by ID
     *
     * @param categoryDto
     * @return
     */
    @RequestMapping(path = WSPath.CATEGORY_GET_BY_ID, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Category> getById(CategoryDto categoryDto) {

        Category category = categoryRepository.findOne(categoryDto.getId());
        return ResponseEntity.ok(category);
    }


}
