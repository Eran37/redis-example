package com.example.redisdemo1.service;

import com.example.redisdemo1.model.User;

import java.util.List;

public interface UserService {

    boolean saveUser(User user);

    List<User> fetchAllUsers();


    User fetchUserById(Long id);

    boolean deleteUser(Long id);
}
