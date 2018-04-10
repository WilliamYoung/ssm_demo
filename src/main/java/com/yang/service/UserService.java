package com.yang.service;

import com.yang.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers(Integer userId);
}