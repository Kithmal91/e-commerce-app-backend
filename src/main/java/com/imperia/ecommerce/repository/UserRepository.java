package com.imperia.ecommerce.repository;

import com.imperia.ecommerce.entity.Item;
import com.imperia.ecommerce.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kithmal on 4/23/18.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
