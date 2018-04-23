package com.imperia.ecommerce.service.impl;

import com.imperia.ecommerce.dto.UserDto;
import com.imperia.ecommerce.dto.response.UserResponse;
import com.imperia.ecommerce.entity.User;
import com.imperia.ecommerce.repository.UserRepository;
import com.imperia.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Kithmal on 4/23/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponse createUser(UserDto userDto) {

        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        User savedUser = userRepository.save(user);
        return new UserResponse(savedUser);
    }
}
