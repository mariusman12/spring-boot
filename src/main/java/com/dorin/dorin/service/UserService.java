package com.dorin.dorin.service;

import com.dorin.dorin.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
