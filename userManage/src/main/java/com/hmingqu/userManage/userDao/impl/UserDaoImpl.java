package com.hmingqu.userManage.userDao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.hmingqu.userManage.model.User;
import com.hmingqu.userManage.userDao.inft.UserDaoInft;

public class UserDaoImpl extends JdbcDaoSupport implements UserDaoInft {

	public List<User> query() {
		// TODO Auto-generated method stub
		List<User> users = getJdbcTemplate().query("SELECT * FROM t_user", new RowMapper<User>(){

			public User mapRow(ResultSet resultSet, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("user"));
				user.setPassword(resultSet.getString("password"));
				user.setHeaderUri(resultSet.getString("header"));
				return user;
			}
			
		});
		return users;
	}
}
