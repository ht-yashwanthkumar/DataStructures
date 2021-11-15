package com.company.ms.search;

public class LinearSearch {
    public static Integer search(int[] arr, int num) {
        System.out.println("Searching using Linear Search technique");
        if (arr.length == 0) {
            System.out.println("No elements are present in Array");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return i;
                }
            }
        }
        return null;
    }
}
