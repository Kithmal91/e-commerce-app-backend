package com.imperia.ecommerce.entity;

import javax.persistence.*;

/**
 * Created by Kithmal on 12/29/17.
 */
@Entity
@Table(name = "ecommerce_suite_item")
public class Item extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_quantity")
    private int quantity;

    @Column(name = "item_retail_price")
    private double retailPrice;

    @Column(name = "item_width")
    private double width;

    @Column(name = "item_height")
    private double height;

    @Column(name = "item_weight")
    private double weight;

    @Column(name = "item_reference_id")
    private String referenceId;

    @Column(name = "item_image_reference")
    private String imageRefId;

    @Column(name = "item_status")
    private String status;

    @Column(name = "item_description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getImageRefId() {
        return imageRefId;
    }

    public void setImageRefId(String imageRefId) {
        this.imageRefId = imageRefId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
