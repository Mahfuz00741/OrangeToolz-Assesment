package com.rhm.spring.batch.config;

import com.rhm.spring.batch.entity.User;
import com.rhm.spring.batch.utils.Utilities;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerProcessor implements ItemProcessor<User,User> {

    @Autowired
    private Utilities utilities;

    @Override
    public User process(User user) throws Exception {

        if (utilities.checkEmail(user.getEmail()) && utilities.checkPhoneNumber(user.getPhoneNumber())) {
            return user;
        }

        return null;
    }
}
