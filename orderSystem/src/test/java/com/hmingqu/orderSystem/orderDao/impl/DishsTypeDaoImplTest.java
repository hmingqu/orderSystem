package com.hmingqu.orderSystem.orderDao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmingqu.orderSystem.orderDao.inft.DishsTypeDaoInft;

public class DishsTypeDaoImplTest {
	private DishsTypeDaoInft dTypeDao;
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-core.xml"});
		dTypeDao = (DishsTypeDaoInft) context.getBean("dTypeDao");
		
		
	}

}
