package com.example.service;

import com.example.entities.User;

import java.util.List;

public interface UserService {
    User addUser(User toCreate);
    List<User> getAllUsers();
}
