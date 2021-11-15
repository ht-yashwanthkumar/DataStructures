package com.company.ms.sort;

public class MergeSort {
    public static int[] sort(int[] arr) {
        int[] array = arr;
        System.out.println("Sorting using Merge Sort technique");

        if (array.length == 0) {
            System.out.println("No elements are present in Array");
            return array;
        } else if (array.length == 1) {
            System.out.println("Since one element present in Array, No need to sort it");
            return array;
        } else {
            int start = 0;
            int end = array.length - 1;
            mergeSort(array, start, end);
            return array;
        }
    }

    private static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, end, mid);
        }
    }

    private static void merge(int[] array, int start, int end, int mid) {
        int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                k += 1;
                i += 1;
            } else {
                temp[k] = array[j];
                k += 1;
                j += 1;
            }
        }
        while (i <= mid) {
            temp[k] = array[i];
            k += 1;
            i += 1;
        }
        while (j <= end) {
            temp[k] = array[j];
            k += 1;
            j += 1;
        }
        for (i = start; i <= end; i++) {
            array[i] = temp[i - start];
        }
    }
}
