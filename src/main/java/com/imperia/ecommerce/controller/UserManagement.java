package com.imperia.ecommerce.controller;

import com.imperia.ecommerce.common.WSPath;
import com.imperia.ecommerce.dto.UserDto;
import com.imperia.ecommerce.dto.response.UserResponse;
import com.imperia.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kithmal on 12/6/17.
 */
@RequestMapping(WSPath.USER_MGT)
@RestController
public class UserManagement {

    @Autowired
    UserService userService;

    @RequestMapping(path = WSPath.USER_REGISTER, method = RequestMethod.POST)
    @ResponseBody
    public UserResponse createUser(@RequestBody UserDto userDto) {
        final UserResponse savedUser = userService.createUser(userDto);
        return savedUser;
    }

}
