package com.hmingqu.orderSystem.orderDao.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmingqu.orderSystem.orderDao.inft.DishsDaoInft;
import com.hmingqu.orderSystem.orderModel.Dishs;

public class DishsDaoImplTest {
	
	private DishsDaoInft dishsDao;
	@Test
	public void addTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-core.xml"});
		dishsDao = (DishsDaoInft) context.getBean("dishsDao");
		
		Dishs dishs = new Dishs();
		dishs.setName("caicai");
		
		dishsDao.add(dishs);
	}
}
