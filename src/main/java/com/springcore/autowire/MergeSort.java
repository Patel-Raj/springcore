package com.springcore.autowire;

public class MergeSort {
    @Override
    public String toString() {
        return "MergeSort{" +
                "index=" + index +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index;

}
