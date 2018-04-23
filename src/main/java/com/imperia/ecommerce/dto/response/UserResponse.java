package com.imperia.ecommerce.dto.response;

import com.imperia.ecommerce.dto.UserDto;
import com.imperia.ecommerce.entity.User;

/**
 * Created by Kithmal on 4/23/18.
 */
public class UserResponse {

    private User user;

    public UserResponse(User user){
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
