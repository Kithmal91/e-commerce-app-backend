package com.imperia.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Created by Kithmal on 12/29/17.
 */
public class ItemDto {

    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "mainCategory")
    private String mainCategory;
    @JsonProperty(value = "itemCategoryId")
    private Long itemCategoryId;
    @JsonProperty(value = "itemCategoryName")
    private String itemCategoryName;
    @JsonProperty(value = "itemName")
    private String itemName;
    @JsonProperty(value = "quantity")
    private int quantity;
    @JsonProperty(value = "retailPrice")
    private double retailPrice;
    @JsonProperty(value = "cost")
    private double cost;
    @JsonProperty(value = "discount")
    private double discount;
    @JsonProperty(value = "width")
    private double width;
    @JsonProperty(value = "height")
    private double height;
    @JsonProperty(value = "weight")
    private double weight;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "referenceId")
    private String referenceId;
    @JsonProperty(value = "imagePath")
    private String imagePath;
    @JsonProperty(value = "status")
    private String status;
    @JsonProperty(value = "diliveryStatus")
    private String diliveryStatus;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the itemCategoryId
     */
    public Long getItemCategoryId() {
        return itemCategoryId;
    }

    /**
     * @param itemCategoryId the itemCategoryId to set
     */
    public void setItemCategoryId(Long itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the retailPrice
     */
    public double getRetailPrice() {
        return retailPrice;
    }

    /**
     * @param retailPrice the retailPrice to set
     */
    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the referenceId
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * @param referenceId the referenceId to set
     */
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath the imagePath to set
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * @return the itemCategoryName
     */
    public String getItemCategoryName() {
        return itemCategoryName;
    }

    /**
     * @param itemCategoryName the itemCategoryName to set
     */
    public void setItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
    }

    /**
     * @return the mainCategory
     */
    public String getMainCategory() {
        return mainCategory;
    }

    /**
     * @param mainCategory the mainCategory to set
     */
    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the diliveryStatus
     */
    public String getDiliveryStatus() {
        return diliveryStatus;
    }

    /**
     * @param diliveryStatus the diliveryStatus to set
     */
    public void setDiliveryStatus(String diliveryStatus) {
        this.diliveryStatus = diliveryStatus;
    }

}
