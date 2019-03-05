package com.cg.bean;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args)
	{
		/*ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		DBConfig config=(DBConfig) context.getBean("dbconfig");
		System.out.println("drivername : "+config.getDriverName());
		System.out.println("url : "+config.getUrl());
		System.out.println("username : "+config.getUsername());
		System.out.println("password : "+config.getPassword());
		*/
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=context.getBean(Employee.class);
		
		System.out.println(emp);
		
	}

}
