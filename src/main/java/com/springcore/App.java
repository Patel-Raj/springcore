package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        // Using setter/property injection.
        Student student1 = (Student) applicationContext.getBean("student1");
        Student student2 = (Student) applicationContext.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);

        Employee employee1 = (Employee) applicationContext.getBean("employee1");
        System.out.println(employee1);

        Line line1 = (Line) applicationContext.getBean("line1");
        System.out.println(line1);
    }
}
