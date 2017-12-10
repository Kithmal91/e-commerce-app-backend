package com.imperia.ecommerce.controller;

import com.imperia.ecommerce.model.User;
import com.imperia.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Kithmal on 12/6/17.
 */
@RequestMapping("/user-mgt")
@RestController
public class UserManagement {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(path = "/save", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@RequestParam("username") String username,
                          @RequestParam("password") String password) {

        User user = new User();
        user.setUserName(username);
        user.setFirstName("Kithmal");
        user.setLastName("Warne");

        User save = userRepository.save(user);
        return save;

    }
}
