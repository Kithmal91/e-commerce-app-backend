package com.imperia.ecommerce.repository;

import com.imperia.ecommerce.entity.Category;
import com.imperia.ecommerce.model.CategoryDto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * CategoryDto Dao Level
 * Created by Kithmal on 12/11/17.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
