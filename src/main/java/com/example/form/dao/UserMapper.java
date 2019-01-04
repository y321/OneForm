package com.example.form.dao;



import com.example.form.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
//注意：别忘了此注解 注入Bean
public interface UserMapper {
    User selectUserByUserName(User user);
    List<User> getAllUser();
    int addUser(User user);
}
