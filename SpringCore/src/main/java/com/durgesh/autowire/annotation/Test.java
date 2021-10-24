package com.durgesh.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/autowire/annotation/config.xml");
		
		Laptop laptop=context.getBean("laptop",Laptop.class);
		//or
		//Laptop laptop2=(Laptop)context.getBean("laptop");
		
		System.out.println(laptop);
	}

}
