package com.durgesh.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test 
{
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/durgesh/standalone/collection/config.xml");
        
        Student2 student1=context.getBean("friends",Student2.class);
        System.out.println(student1);
	}

}
