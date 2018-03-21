package com.dj.springboot_mybatis.mapper;

public class UserMapperSql {

    public String readUser2(){
        return "SELECT * FROM USER";
    }

    public String addUser2(){
        return "INSERT INTO USER (username,password,sex) values(#{username},#{password},#{sex})";
    }

    public String delUser2(){
        return "DELETE from USER WHERE id = #{i}";
    }

    public String updateUser2(){
        return "update USER set username=#{username} where id=#{id}";
    }


}
