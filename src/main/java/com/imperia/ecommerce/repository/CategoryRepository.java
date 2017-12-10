package com.imperia.ecommerce.repository;

import com.imperia.ecommerce.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * Category Dao Level
 * Created by Kithmal on 12/11/17.
 */
public interface CategoryRepository extends CrudRepository<Category, String> {
}
