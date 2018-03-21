package com.dj.springboot_mybatis.service;

import com.dj.springboot_mybatis.domain.User;
import com.dj.springboot_mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSericeImpl implements UserSerice{

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> readUser() {
        return userMapper.readUser();
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }


    @Override
    public void delUser(int i) {
        userMapper.delUser(i);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }


    //======================
    @Override
    public User findUserById(int i) {
        return userMapper.findUserById(i);
    }

    @Override
    public void addUser1(User user) {
        userMapper.addUser1(user);
    }

    @Override
    public void delUser1(int i) {
        userMapper.delUser1(i);
    }

    @Override
    public void updateUser1(User user) {
        userMapper.updateUser1(user);
    }


    /**
     * 基于辅助类
     * @return
     */
    @Override
    public List<User> readUser2() {
        return userMapper.readUser2();
    }

    @Override
    public void addUser2(User user) {
        userMapper.addUser2(user);
    }

    @Override
    public void delUser2(int i) {
        userMapper.delUser2(i);
    }

    @Override
    public void updateUser2(User user) {
        userMapper.updateUser2(user);
    }

    @Override
    public List<User> readUser3() {
        return userMapper.readUser3();
    }

    @Override
    public User findUserById3(Integer id) {
        return userMapper.findUserById3(id);
    }

    @Override
    public Integer addUser3(User user) {
        return userMapper.addUser3(user);
    }

    @Override
    public Integer delUserById(Integer id) {
        return userMapper.delUserById(id);
    }

    @Override
    public Integer updateUserById(User user) {
        return userMapper.updateUserById(user);
    }



    @Override
    public List<User> viewTest() {
        return userMapper.viewTest();
    }


}
