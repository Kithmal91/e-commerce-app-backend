package com.imperia.ecommerce.repository;

import com.imperia.ecommerce.entity.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Item Database access level
 * Created by Kithmal on 12/29/17.
 */
public interface ItemRepository extends CrudRepository<Item, Long> {

    @Query("SELECT a FROM Item a where a.category.id = :category")
    List<Item> findByCategory(@Param("category") Long category);
}
