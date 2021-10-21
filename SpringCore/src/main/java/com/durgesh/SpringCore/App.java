package com.durgesh.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("Config.xml");
        
        Student student1=(Student)context.getBean("Student1");
        
        Student student2=(Student)context.getBean("Student2");
        Student student3=(Student)context.getBean("Student3");
        Student student4=(Student)context.getBean("Student4");
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        
        
    }
}
