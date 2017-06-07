package com.hmingqu.orderSystem.orderDao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hmingqu.orderSystem.orderDao.inft.DishsDaoInft;
import com.hmingqu.orderSystem.orderModel.Dishs;
import com.hmingqu.util.MyHibernateDaoSupport;

@Transactional(readOnly=false)
@Repository("dishsDao")
public class DishsDaoImpl extends MyHibernateDaoSupport implements DishsDaoInft {

	@Override
	public void add(Dishs dish) {
		getHibernateTemplate().save(dish);
	}
}
