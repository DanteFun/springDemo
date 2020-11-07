package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
//		
//		IUser iUser = (IUser)ac.getBean("userDao");
//		System.out.println(iUser.getClass());
//		iUser.save();
		
        OrderDao orderDao = (OrderDao) ac.getBean("orderDao");

        System.out.println(orderDao.getClass());

        orderDao.save();
	}
}
