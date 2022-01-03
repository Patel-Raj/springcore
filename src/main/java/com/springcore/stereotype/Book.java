package com.springcore.stereotype;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bk")
public class Book {

    @Value("Atomic Habits")
    private String name;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
