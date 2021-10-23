package com.durgesh.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4
{
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/lifecycle/Config.xml");
		
		Bus bus=(Bus) context.getBean("bus");
		System.out.println(bus);
		
		context.registerShutdownHook();
	}

}
