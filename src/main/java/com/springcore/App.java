package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

    Logger
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) applicationContext.getBean("student1");
        System.out.println(student);
    }
}