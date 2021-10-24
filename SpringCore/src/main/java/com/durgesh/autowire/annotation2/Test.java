package com.durgesh.autowire.annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/autowire/annotation2/config.xml");
		
		Laptop laptop=context.getBean("laptop",Laptop.class);
		
		System.out.println(laptop);
	}

}
