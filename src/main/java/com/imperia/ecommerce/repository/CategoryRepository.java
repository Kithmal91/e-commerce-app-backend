package com.imperia.ecommerce.repository;

import com.imperia.ecommerce.entity.Category;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * CategoryDto Dao Level Created by Kithmal on 12/11/17.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    @Query("SELECT a FROM Category a where a.mainCategory = :mainCategory")
    List<Category> findByMainCategory(@Param("mainCategory") String mainCategory);
}
