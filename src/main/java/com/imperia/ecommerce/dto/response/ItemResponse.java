package com.imperia.ecommerce.dto.response;

import com.imperia.ecommerce.dto.ItemDto;

import java.util.List;

/**
 * Created by Rajith on 2/5/18.
 */
public class ItemResponse {

    private List<ItemDto> dtos;

    public List<ItemDto> getDtos() {
        return dtos;
    }

    public void setDtos(List<ItemDto> dtos) {
        this.dtos = dtos;
    }
}
