package com.imperia.ecommerce.repository;

import com.imperia.ecommerce.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kithmal on 12/7/17.
 */
public interface UserRepository  extends CrudRepository<User, String> {
}
