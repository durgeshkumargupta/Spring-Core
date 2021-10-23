package com.durgesh.construction.injectionXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/construction/injectionXML/Config.xml");
		
		Employee person=(Employee)context.getBean("employee");
		System.out.println(person);
		
	}

}
