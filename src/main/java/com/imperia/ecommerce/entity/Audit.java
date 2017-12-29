package com.imperia.ecommerce.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Audit Properties are added
 * Created by Kithmal on 12/29/17.
 */
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class Audit {

    @Column(name = "added_date", nullable = false, updatable = false)
    @CreatedDate
    private Date createdDate;

    @Column(name = "added_by")
    @CreatedBy
    private String createdBy;

    @Column(name = "modified_date")
    @LastModifiedDate
    private Date modifiedDate;

    @Column(name = "modified_by")
    @LastModifiedBy
    private String modifiedBy;

}
