package com.hmingqu.userManage.userDao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmingqu.userManage.model.User;
import com.hmingqu.userManage.userDao.inft.UserDaoInft;

public class UserDaoImplTest {
	
	private UserDaoInft userDao;

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-core.xml"});
		userDao = (UserDaoInft) context.getBean("userDao");
		
		List<User> users = userDao.query();
		for(User user:users){
			System.out.println(user);
		}
	}

}
