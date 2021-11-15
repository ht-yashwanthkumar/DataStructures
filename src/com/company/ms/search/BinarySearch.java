package com.company.ms.search;

public class BinarySearch {
    public static Integer search(int[] arr, int num) {
        System.out.println("Searching using Binary Search technique");
        int end = arr.length;
        return binarySearch(arr, 0, end, num);
    }

    public static Integer binarySearch(int[] arr, int low, int high, int num) {
        if (low < high) {
            int mid = (low + high) / 2;
            if (num == arr[mid]) {
                return mid;
            } else if (num < arr[mid]) {
                return binarySearch(arr, low, mid, num);
            } else {
                return binarySearch(arr, mid + 1, high, num);
            }
        }
        return null;
    }
}
