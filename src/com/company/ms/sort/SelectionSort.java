package com.company.ms.sort;

import com.company.ms.Main;

public class SelectionSort {
    public static int[] sort(int[] arr) {
        int[] array = arr;
        System.out.println("Sorting using Selection Sort technique");

        if (array.length == 0) {
            System.out.println("No elements are present in Array");
            return array;
        } else if (array.length == 1) {
            System.out.println("Since one element present in Array, No need to sort it");
            return array;
        } else {
            for (int i = 0; i < array.length; i++) {
                int min = i;
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] < array[min]) {
                        min = j;
                    }
                }
                if (min != i) {
                    Main.swap(array, min, i);
                }
            }
            return array;
        }
    }
}
