package com.dj.springboot_mybatis.mapper;

import com.dj.springboot_mybatis.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {
    //查询
    List<User> readUser();


    void addUser(User user);


    void delUser(int i);

    void updateUser(User user);


    //----------------------------------

    @Select("select * from user where id = #{i}")
    User findUserById(int i);

    @Insert("INSERT INTO USER (username,password,sex) values(#{username},#{password},#{sex})")
    void addUser1(User user);

    @Delete("DELETE from USER WHERE id = #{i}")
    void delUser1(int i);

    @Update("update USER set username=#{username} where id=#{id}")
    void updateUser1(User user);

    //----------------------------------

    @SelectProvider(type = UserMapperSql.class,method = "readUser2")
    List<User> readUser2();

    @InsertProvider(type = UserMapperSql.class,method = "addUser2")
    void addUser2(User user);

    @DeleteProvider(type = UserMapperSql.class,method = "delUser2")
    void delUser2(int i);

    @UpdateProvider(type = UserMapperSql.class,method = "updateUser2")
    void updateUser2(User user);



    List<User> readUser3();

    User findUserById3(Integer id);

    Integer addUser3(User user);

    Integer delUserById(Integer id);

    Integer updateUserById(User user);

    List<User> viewTest();










    /*@Select("select * from user")
    List<UserMapperSql> findUserAll();

    @Select("select * from user where id = #{id}")
    UserMapperSql findUserById(Integer id);

    void deleteAll(List<Integer> ids);

    @Insert("insert into user (name) values (#{name})")
    @SelectKey(before = false, keyProperty="id",resultType = Integer.class, statement = "SELECT LAST_INSERT_ID()")
    void insertUser(UserMapperSql user);

    @Update("update user set name = #{name} where id = #{id}")
    void updateUser(UserMapperSql user);

    @SelectProvider(type = UserMapperSQL.class,method = "findUserByIdd")
    UserMapperSql findUserByIdd(Integer id);*/

}
