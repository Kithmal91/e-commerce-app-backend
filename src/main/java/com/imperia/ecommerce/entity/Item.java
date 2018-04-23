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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "image_id")
    private ImageBank imageBank;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_quantity")
    private int quantity;

    @Column(name = "item_retail_price")
    private double retailPrice;

    @Column(name = "item_cost")
    private double cost;

    @Column(name = "item_discount")
    private double discount;

    @Column(name = "item_width")
    private double width;

    @Column(name = "item_height")
    private double height;

    @Column(name = "item_weight")
    private double weight;

    @Column(name = "item_reference_id")
    private String referenceId;

    @Column(name = "item_status")
    private String status;

    @Column(name = "item_dilivery_status")
    private String diliveryStatus;

    @Column(name = "item_description")
    private String description;

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
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the imageBank
     */
    public ImageBank getImageBank() {
        return imageBank;
    }

    /**
     * @param imageBank the imageBank to set
     */
    public void setImageBank(ImageBank imageBank) {
        this.imageBank = imageBank;
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
