package com.genezeiniss.big_o_notation;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    // O(log n)
    //note: the values in the list must be sorted in ascending order!
    public static void recursiveSearch(List<Integer> array, int startIndex, int endIndex, int target) {

        if (startIndex > endIndex) {
            System.out.printf("number %s not found in arrat %s%n", target, array.toString());
            return;
        }

        int midIndex = (startIndex + endIndex) / 2;
        int mid = array.get(midIndex);

        if (mid == target) {
            System.out.printf("target value index is: %s%n", midIndex);
        } else if ( mid > target) {
            recursiveSearch(array, startIndex, midIndex -1, target);
        } else {
            recursiveSearch(array, midIndex + 1, endIndex, target);
        }
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int start = 0;
        int end = array.size() - 1;
        int target  = -10;
        recursiveSearch(array, start, end, target);
    }
}
