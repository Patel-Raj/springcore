package com.springcore.standalone;

import java.util.Map;

public class Bike {
    private Map<String, String> bike;

    @Override
    public String toString() {
        return "Bike{" +
                "bike=" + bike +
                '}';
    }

    public Map<String, String> getBike() {
        return bike;
    }

    public void setBike(Map<String, String> bike) {
        this.bike = bike;
    }
}
