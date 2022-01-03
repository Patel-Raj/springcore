package com.springcore.standalone;

import com.springcore.autowire.BinarySearch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StandaloneApp {

    public static void main(String args[]) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        // contains destroy lifecycle method
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("standalone-config.xml");
        //applicationContext.registerShutdownHook();

        Bike bs = (Bike) applicationContext.getBean("bike");
        System.out.println(bs);
    }
}
