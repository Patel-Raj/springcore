package com.springcore;

public class Addition {
    private int num1;
    private int num2;

    public Addition(double num1, double num2) {
        this.num1 = (int) num1;
        this.num2 = (int) num2;
        System.out.println("double args");
    }

    public Addition(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("integer args");
    }



    @Override
    public String toString() {
        return "Addition{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
