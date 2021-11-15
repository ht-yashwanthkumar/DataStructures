package com.company.ms.sort;

public class InsertionSort {
    public static int[] sort(int[] arr) {
        int[] array = arr;
        System.out.println("Sorting using Insertion Sort technique");

        if (array.length == 0) {
            System.out.println("No elements are present in Array");
            return array;
        } else if (array.length == 1) {
            System.out.println("Since one element present in Array, No need to sort it");
            return array;
        } else {
            for (int i = 1; i < array.length; i++) {
                int j = i - 1;
                int temp = array[i];
                while (j >= 0 && array[j] > temp) {
                    array[j] = array[j + 1];
                    j--;
                }
                array[j + 1] = temp;

            }
            return array;
        }
    }
}
