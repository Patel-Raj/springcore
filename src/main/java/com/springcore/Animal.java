package com.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void initAnimal() {
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void destroyAnimal() {
        System.out.println("PreDestroy");
    }
}
