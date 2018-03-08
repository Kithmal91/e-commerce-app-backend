package com.imperia.ecommerce.entity;

import javax.persistence.*;

/**
 * Created by Rajitha on 02/26/18.
 */
@Entity
@Table(name = "ecommerce_suite_image_bank")
public class ImageBank extends Audit {

    @Id
    @Column(name = "image_id")
    private String id;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "item_status")
    private String status;

    @Column(name = "item_description")
    private String description;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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

}