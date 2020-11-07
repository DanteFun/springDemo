package com;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
        OrderDao orderDao = (OrderDao) ac.getBean("orderDao");

        System.out.println(orderDao.getClass());

        orderDao.save();
	}
	
	
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
        IUser userDao = (IUser) ac.getBean("userDao");

        System.out.println(userDao.getClass());

        userDao.save();
	}
	
	
	@Test
	public void test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
        UserService userService = (UserService) ac.getBean("userService");
        userService.save();
	}
}
