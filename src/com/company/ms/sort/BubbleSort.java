package com.company.ms.sort;

import com.company.ms.Main;

public class BubbleSort {
    public static int[] sort(int[] arr) {
        int[] array = arr;
        System.out.println("Sorting using Bubble Sort technique");

        if (array.length == 0) {
            System.out.println("No elements are present in Array");
            return array;
        } else if (array.length == 1) {
            System.out.println("Since one element present in Array, No need to sort it");
            return array;
        } else {
            boolean sorted;
            for (int i = 0; i < array.length; i++) {
                sorted = true;
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        Main.swap(array, j, j + 1);
                        sorted = false;
                    }
                }
                if (sorted) {
                    return array;
                }
            }
        }
        return null;
    }
}
