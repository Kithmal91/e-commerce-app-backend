package com.imperia.ecommerce.service;

import com.imperia.ecommerce.dto.UserDto;
import com.imperia.ecommerce.dto.response.UserResponse;

/**
 * Created by Kithmal on 4/23/18.
 */
public interface UserService {

    //Create User
    UserResponse createUser(UserDto userDto);
}
