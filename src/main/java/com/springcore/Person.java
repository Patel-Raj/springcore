package com.springcore;


import java.util.List;

public class Person {
    private int personId;
    private List<String> favoriteColors;
    private Certificate personCertificate;

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", favoriteColors=" + favoriteColors +
                ", personCertificate=" + personCertificate +
                '}';
    }

    public Person(int personId, List<String> favoriteColors, Certificate personCertificate) {
        this.personId = personId;
        this.favoriteColors = favoriteColors;
        this.personCertificate = personCertificate;
    }

}
