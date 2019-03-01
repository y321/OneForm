package com.example.form.controlelr;


import com.example.form.entity.User;
import com.example.form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public boolean login(String name,String password){
        System.out.println("weixin username:"+name+"password:"+password);
        boolean login= userService.login(name,password);
        if(login){
            return true;
        }
        return false;
    }
    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser(){
        List<User> alluser=null;
        try {
            alluser = userService.getAllUser();
        }catch (Exception e){
            System.out.println(e );
        }
        return alluser;
    }
    @RequestMapping("/reg")
    public boolean regUser(String name,String password){
       // System.out.println("weixin username:"+name+"password:"+password);
        System.out.println(userService.regUser(name,password));
        return  false;

    }
}

