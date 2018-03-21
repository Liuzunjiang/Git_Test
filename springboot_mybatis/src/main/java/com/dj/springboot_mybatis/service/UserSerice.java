package com.dj.springboot_mybatis.service;

import com.dj.springboot_mybatis.domain.User;

import java.util.List;

public interface UserSerice {
    //查询
    List<User> readUser();

    //添加用户
    void addUser(User user);

    void delUser(int i);

    void updateUser(User user);



    //基于注解类

    User findUserById(int i);

    void addUser1(User user);

    void delUser1(int i);

    void updateUser1(User user);

    //基于辅助类

    List<User> readUser2();

    void addUser2(User user);

    void delUser2(int i);

    void updateUser2(User user);


    /**
     * postMan Test
     * @return
     */
    List<User> readUser3();

    User findUserById3(Integer id);

    Integer addUser3(User user);

    Integer delUserById(Integer id);

    Integer updateUserById(User user);


    List<User> viewTest();
}
