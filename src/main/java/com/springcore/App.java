package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

    public static void main(String args[]) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        // contains destroy lifecycle method
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        applicationContext.registerShutdownHook();

        // Using setter/property injection.
        Student student1 = (Student) applicationContext.getBean("student1");
        Student student2 = (Student) applicationContext.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);

        Employee employee1 = (Employee) applicationContext.getBean("employee1");
        System.out.println(employee1);

        Line line1 = (Line) applicationContext.getBean("line1");
        System.out.println(line1);

        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1);

        Addition addition = (Addition) applicationContext.getBean("add1");
        System.out.println(addition);

        Car car = (Car) applicationContext.getBean("car1");
        System.out.println(car);

    }
}
