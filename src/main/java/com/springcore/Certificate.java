package com.springcore;

public class Certificate {
    private String certiName;

    public Certificate(String certiName) {
        this.certiName = certiName;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certiName='" + certiName + '\'' +
                '}';
    }
}
