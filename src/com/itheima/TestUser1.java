package com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser1 {
public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	User1 user1 = (User1) applicationContext.getBean("user1");
	System.out.println(user1);
}
}
