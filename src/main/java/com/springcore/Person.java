package com.springcore;


import java.util.List;

public class Person {
    private int personId;
    private List<Certificate> certificates;

    public Person(int personId, List<Certificate> certificates) {
        this.personId = personId;
        this.certificates = certificates;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", certificates=" + certificates +
                '}';
    }
}
