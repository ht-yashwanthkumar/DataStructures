package com.company.ms;

import com.company.ms.search.BinarySearch;
import com.company.ms.search.LinearSearch;
import com.company.ms.sort.BubbleSort;
import com.company.ms.sort.InsertionSort;
import com.company.ms.sort.MergeSort;
import com.company.ms.sort.SelectionSort;

import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // sortAlg();
        searchAlg();
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    private static void printArray(int[] sortedArray) {
        Arrays.stream(sortedArray).forEach(num -> System.out.print(" " + num));
    }

    private static void sortAlg() {
        int[] array = {40, 0, 10, -1, 2, 22, 3};
        int[] bubbleSortedArray = BubbleSort.sort(array);
        printArray(bubbleSortedArray);
        System.out.println();
        int[] selectionSortedArray = SelectionSort.sort(array);
        printArray(selectionSortedArray);
        System.out.println();
        int[] insertionSortedArray = InsertionSort.sort(array);
        printArray(insertionSortedArray);
        System.out.println();
        int[] mergeSortedArray = MergeSort.sort(array);
        printArray(mergeSortedArray);
    }

    private static void searchAlg() {
        int[] array = {2, 10, 11, 14};
        int num = 10;
        Optional<Integer> optLinearSearchNum = Optional.ofNullable(LinearSearch.search(array, num));
        printNumber(optLinearSearchNum, num);

        Optional<Integer> optBinSearchNum = Optional.ofNullable(BinarySearch.search(array, num));
        printNumber(optBinSearchNum, num);
    }

    private static void printNumber(Optional<Integer> optionalNumber, int num) {
        if (!optionalNumber.isPresent()) {
            System.out.println("Element not Found");
            return;
        }
        System.out.println("Number " + num + " Found at location " + optionalNumber.get());
    }

}
