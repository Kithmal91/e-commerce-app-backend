package com.imperia.ecommerce.repository;

import com.imperia.ecommerce.entity.Category;
import com.imperia.ecommerce.entity.ImageBank;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * Image Bank Dao Level
 * Created by Kithmal on 12/11/17.
 */
public interface ImageBankRepository extends CrudRepository<ImageBank, String> {
}