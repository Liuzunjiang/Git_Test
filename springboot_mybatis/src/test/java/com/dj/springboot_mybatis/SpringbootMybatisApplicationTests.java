package com.dj.springboot_mybatis;

import com.dj.springboot_mybatis.domain.User;
import com.dj.springboot_mybatis.mapper.UserMapperSql;
import com.dj.springboot_mybatis.service.UserSerice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

	@Autowired
	private UserSerice userSerice;

	/**
	 * 基于xml配置文件--------------------------------------------
	 */
	//添加用户
	@Test
	public void addUser(){
		User user = new User();
		user.setUsername("aaaaaa");
		user.setPassword("222222");
		user.setSex(1);
		userSerice.addUser(user);
	}

	//删除
	@Test
	public void delUser(){
		userSerice.delUser(14);
	}

	//修改用户
	@Test
	public void updateUser(){
		User user = new User();
		user.setId(1);
		user.setUsername("张三三");
		userSerice.updateUser(user);
	}

	//查询
	@Test
	public void readUser(){
		List<User> list = userSerice.readUser();
		for (User user: list) {
			System.out.println(user.getUsername() + user.getPassword() + user.getSex());
		}
	}

	/**
	 * 基于注解类--------------------------------------------
	 */
	//添加用户
	@Test
	public void addUser1(){
		User user = new User();
		user.setUsername("注解注解");
		user.setPassword("666666");
		user.setSex(2);
		userSerice.addUser1(user);
	}

	//删除
	@Test
	public void delUser1(){
		userSerice.delUser1(16);
	}

	//修改
	@Test
	public void updateUser1(){
		User user = new User();
		user.setId(1);
		user.setUsername("张三三");
		userSerice.updateUser1(user);
	}

	//查询
	@Test
	public void findUserById(){
		User user = userSerice.findUserById(1);
		System.out.println(user.getUsername() + "============" + user.getPassword() + "============" + user.getSex());
	}


	/**
	 * 基于sql辅助类----------------------------------------------
	 */
	//添加用户
	@Test
	public void addUser2(){
		User user = new User();
		user.setUsername("注解注解");
		user.setPassword("666666");
		user.setSex(2);
		userSerice.addUser2(user);
	}

	//删除
	@Test
	public void delUser2(){
		userSerice.delUser2(19);
	}

	//修改
	@Test
	public void updateUser2(){
		User user = new User();
		user.setId(1);
		user.setUsername("张三三");
		userSerice.updateUser2(user);
	}

	//查询
	@Test
	public void readUser2(){
		List<User> list = userSerice.readUser2();
		for (User user: list) {
			System.out.println(user.getUsername() + user.getPassword() + user.getSex());
		}
	}


}
