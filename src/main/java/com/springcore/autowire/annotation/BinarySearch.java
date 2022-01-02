package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class BinarySearch {


    private MergeSort mergeSort;

    @Override
    public String toString() {
        return "BinarySearch{" +
                "mergeSort=" + mergeSort +
                '}';
    }


    public BinarySearch() {
    }


    public BinarySearch(MergeSort mergeSort) {
        this.mergeSort = mergeSort;
    }

    public MergeSort getMergeSort() {
        return mergeSort;
    }

    @Autowired
    public void setMergeSort(MergeSort mergeSort) {
        this.mergeSort = mergeSort;
    }
}
