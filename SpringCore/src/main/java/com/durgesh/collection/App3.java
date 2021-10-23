package com.durgesh.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/collection/Config.xml");

		Car car=(Car)context.getBean("car");
		System.out.println(car);
	}

}
