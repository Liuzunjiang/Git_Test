package com.dj.springboot_mybatis.controller;

import com.dj.springboot_mybatis.domain.User;
import com.dj.springboot_mybatis.service.UserSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserSerice userSerice;

    //全表查询
    @RequestMapping("readUser3")
    @ResponseBody
    public List<User> readUser3(){
        List<User> user = userSerice.readUser3();
        return user;
    }

    //id查询
    @RequestMapping("findUserById3")
    @ResponseBody
    public User findUserById3(Integer id){
        User user = userSerice.findUserById3(id);
        return user;
    }

    //增加
    @RequestMapping("addUser3")
    @ResponseBody
    public String addUser3(){
        User user = new User();
        user.setUsername("张二和");
        user.setPassword("232323");
        user.setSex(2);
        Integer id = userSerice.addUser3(user);
        if (!StringUtils.isEmpty(id)) {
            return "ok";
        }
        return "no";
    }

    //根据id删除
    @RequestMapping("delUserById")
    @ResponseBody
    public String delUserById(Integer id){
        Integer idd = userSerice.delUserById(id);
       if (!StringUtils.isEmpty(idd)) {
           return "ok";
       }
       return "no";
    }

    //修改
    @RequestMapping("updateUserById")
    @ResponseBody
    public String updateUserById(){
        User user = new User();
        user.setId(24);
        user.setUsername("李四四");
        Integer id = userSerice.updateUserById(user);
        if (!StringUtils.isEmpty(id)) {
            return "ok";
        }
        return "no";
    }

    @RequestMapping("test")
    public User test(@RequestBody User user){
        return user;
    }


    /**
     * .html 展示Test
     */
    @RequestMapping("viewTest")
    public String viewTest(Model model){
        model.addAttribute("userList",userSerice.viewTest());
        return "userList";
    }





}
