package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class BinarySearch {

    @Autowired
    private MergeSort mergeSort;

    @Override
    public String toString() {
        return "BinarySearch{" +
                "mergeSort=" + mergeSort +
                '}';
    }

    public BinarySearch() {
    }

    public MergeSort getMergeSort() {
        return mergeSort;
    }

    public void setMergeSort(MergeSort mergeSort) {
        this.mergeSort = mergeSort;
    }
}
