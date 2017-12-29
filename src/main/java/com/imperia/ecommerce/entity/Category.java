package com.imperia.ecommerce.entity;

import javax.persistence.*;

/**
 * Created by Kithmal on 12/29/17.
 */
@Entity
@Table(name = "ecommerce_suite_category")
public class Category extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(name = "main_category")
    private String mainCategory;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_description")
    private String description;

    @Column(name = "category_status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
