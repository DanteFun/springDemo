package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUser{
	
	
	@Autowired
	private JdbcTemplate template;
	
    public void save() {
    	String sql = "insert into user(username,password) values('zyf','222')";
    	template.update(sql);
    }
}
