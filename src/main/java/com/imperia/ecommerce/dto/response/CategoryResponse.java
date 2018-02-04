package com.imperia.ecommerce.dto.response;

import com.imperia.ecommerce.dto.CategoryDto;

import java.util.List;

/**
 * Created by Kithmal on 2/5/18.
 */
public class CategoryResponse {

    private List<CategoryDto> dtos;

    public List<CategoryDto> getDtos() {
        return dtos;
    }

    public void setDtos(List<CategoryDto> dtos) {
        this.dtos = dtos;
    }
}
