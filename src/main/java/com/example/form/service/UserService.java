package com.example.form.service;

import com.example.form.dao.UserMapper;
import com.example.form.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

@Service(value = "userServiceI")
public class UserService implements UserServiceI {

    @Resource
    private UserMapper userMapper;


    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
    public boolean login(String userName,String wechatNum){
        User user = new User();
        user.setUserName(userName);
        user.setWechatNum(wechatNum);

        User user1 = userMapper.selectUserByUserName(user);
        if (user1!=null){
            return true;
        }
        return false;
    }
    public boolean regUser(String userName,String password){
        User user = new User();
        user.setUserName("321");
        System.out.println(1);
        user.setWechatNum(password);
        System.out.println(userMapper.addUser(user));

        if(userMapper.addUser(user)!=0){
            return true;
        }else {
            return false;
        }

    }
}
