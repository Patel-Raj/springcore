package com.springcore.autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutoApp {

    public static void main(String args[]) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        // contains destroy lifecycle method
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire-config-annotation.xml");
        applicationContext.registerShutdownHook();

        BinarySearch bs = (BinarySearch) applicationContext.getBean("bs1");
        System.out.println(bs);
    }
}
