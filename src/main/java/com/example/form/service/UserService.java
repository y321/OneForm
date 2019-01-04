package com.example.form.service;

import com.example.form.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    boolean login(String userName,String wechatNum);
    boolean regUser(String userName,String wechatNum);
}
