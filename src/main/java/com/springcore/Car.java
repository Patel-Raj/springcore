package com.springcore;

public class Car {
    private int model;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                '}';
    }

    public void init() {
        System.out.println("Init method called");
    }

    public void destroy() {
        System.out.println("Destroy method called");
    }
}
