package com.fuyu.service.impl;
import com.fuyu.domain.User;
import com.fuyu.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void save(User user) {
        System.out.println("user service ...");
    }
}
