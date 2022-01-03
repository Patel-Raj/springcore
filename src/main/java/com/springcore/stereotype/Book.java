package com.springcore.stereotype;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("bk")
@Scope("prototype")
public class Book {

    @Value("Atomic Habits")
    private String name;

    @Value("#{lang}")
    private List<String> languages;

    @Value("#{ T(java.lang.Math).PI }")
    private double PI;

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", languages=" + languages +
                ", PI=" + PI +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
