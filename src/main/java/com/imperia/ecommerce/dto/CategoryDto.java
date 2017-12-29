package com.imperia.ecommerce.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * CategoryDto Dto
 * Created by Kithmal on 12/11/17.
 */
@XmlRootElement
public class CategoryDto {

    public String mainCategory;
    public String categoryName;
    public String description;
    public String status;

    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
