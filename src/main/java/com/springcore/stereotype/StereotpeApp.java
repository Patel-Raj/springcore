package com.springcore.stereotype;

import com.springcore.standalone.Bike;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StereotpeApp {

    public static void main(String args[]) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        // contains destroy lifecycle method
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("stereotype-config.xml");
        //applicationContext.registerShutdownHook();

        Book bs = (Book) applicationContext.getBean("bk");
        System.out.println(bs);
    }
}
