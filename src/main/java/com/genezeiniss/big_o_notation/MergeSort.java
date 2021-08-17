package com.genezeiniss.big_o_notation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSort {

    // O(n log n)
    public static List<Integer> mergeSort(List<Integer> array) {

        if (array.size() < 2) {
            return array; // base case: array should not be sorted
        }

        // find middle of array
        int midIndex = array.size() / 2;
        List<Integer> leftArray = array.subList(0, midIndex); // exclude "to" index
        List<Integer> rightArray = array.subList(midIndex, array.size()); // exclude "to" index

        return merge(mergeSort(leftArray), mergeSort(rightArray));
    }

    private static List<Integer> merge(List<Integer> leftArray, List<Integer> rightArray) {

        List<Integer> sortedArray = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArray.size() && rightIndex < rightArray.size()) {

            if (leftArray.get(leftIndex) < rightArray.get(rightIndex)) {
                sortedArray.add(leftArray.get(leftIndex));
                leftIndex += 1;
            } else {
                sortedArray.add(rightArray.get(rightIndex));
                rightIndex += 1;
            }
        }

        sortedArray.addAll(leftArray.subList(leftIndex, leftArray.size()));
        sortedArray.addAll(rightArray.subList(rightIndex, rightArray.size()));

        return sortedArray;
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(3, 12, 16, 1, 6, 15);
        System.out.println(mergeSort(array).toString());
    }
}
