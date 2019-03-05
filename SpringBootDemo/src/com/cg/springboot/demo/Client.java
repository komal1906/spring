package com.cg.springboot.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cg")
public class Client {
	public static void main(String args[])
	{
		//ApplicationContext context=SpringApplication.run(Client.class,args);
		ApplicationContext context=new AnnotationConfigApplicationContext(Client.class);
		Employee ep=(Employee)context.getBean("emp");
		System.out.println(ep);
		
	}
}
