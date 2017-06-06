package com.hmingqu.orderSystem.orderDao.impl;

import org.springframework.stereotype.Repository;

import com.hmingqu.orderSystem.orderDao.inft.DishsTypeDaoInft;
import com.hmingqu.orderSystem.orderModel.DishsType;
import com.hmingqu.util.MyHibernateDaoSupport;

@Repository("dTypeDao")
public class DishsTypeDaoImpl extends MyHibernateDaoSupport implements DishsTypeDaoInft {
	
	@Override
	public void add(DishsType dType) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(dType);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		String[] ids = id.split(",");
		String hql = "DELETE FROM DishsType WHERE id in (+ids+)";
		getHibernateTemplate().delete(hql, ids);
	}

}
