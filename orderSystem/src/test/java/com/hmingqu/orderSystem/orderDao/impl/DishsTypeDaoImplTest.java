package com.hmingqu.orderSystem.orderDao.impl;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmingqu.orderSystem.orderDao.inft.DishsTypeDaoInft;
import com.hmingqu.orderSystem.orderModel.DishsType;

public class DishsTypeDaoImplTest {
	private DishsTypeDaoInft dTypeDao;
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-core.xml"});
		dTypeDao = (DishsTypeDaoInft) context.getBean("dTypeDao");
		
		DishsType dType = new DishsType();
		dType.setName("杂项");
		dTypeDao.add(dType);	
	}

}
