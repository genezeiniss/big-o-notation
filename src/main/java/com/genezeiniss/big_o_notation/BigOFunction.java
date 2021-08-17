package com.genezeiniss.big_o_notation;

import java.util.Arrays;
import java.util.List;

public class BigOFunction {

    public static void liner(List<Integer> numbers) {

        // this for loop is linear or O(n)
        for (int i = 0; i < numbers.size(); i++) {
            constant(); // O(1) - is ignored, since O(n) - for loop - is worst complexity case
            System.out.println("additional example of constant"); // ignored, since O(n) is worst complexity case
        }
    }

    // O(1) - best case
    public static void constant() {
        // O(1) - constant time - now matter what is the size of array (numbers),
        // it will always take the same time to print calculation result
        System.out.println(1000 * 100000);
    }

    // O(n^2)
    public static void square(int n) {
        for (int i = 0; i < n; i++) { // for each iteration of i for loop we will run a nested j loop
            for (int j = 0; j < n; j++) {
                System.out.printf("%s, %s%n", i, j);
            }
        }
        // let's assume, n equals to 3
        // first i loop iteration
        // i = 0; j = 0
        // i = 0; j = 1
        // i = 0; j = 2
        // second i loop iteration
        // i = 1; j = 0
        // i = 1; j = 1
        // i = 1; j = 2
        // thirs i loop iteration
        // i = 2; j = 0
        // i = 2; j = 1
        // i = 2; j = 2
    }

    // O(n^3)
    public static void cube(int n) {
        for (int i = 0; i < n; i++) { // for each iteration of i for loop we will run a nested j loop
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++)
                System.out.printf("%s, %s, %S%n", i, j, k);
            }
        }

        // first i iteration
        //// first j iteration
        //0, 0, 0
        //0, 0, 1
        //0, 0, 2
        //// second j iteration
        //0, 1, 0
        //0, 1, 1
        //0, 1, 2
        //// third j iteration
        //0, 2, 0
        //0, 2, 1
        //0, 2, 2
        // second i iteration
        //1, 0, 0
        //1, 0, 1
        //1, 0, 2
        //1, 1, 0
        //1, 1, 1
        //1, 1, 2
        //1, 2, 0
        //1, 2, 1
        //1, 2, 2
        // third i iteration
        //2, 0, 0
        //2, 0, 1
        //2, 0, 2
        //2, 1, 0
        //2, 1, 1
        //2, 1, 2
        //2, 2, 0
        //2, 2, 1
        //2, 2, 2
    }

    //  O(log n)
    public static void logNRecursive(double n) {
        if (n == 1) return;
        n = Math.floor(n / 2); // in computer science the base is always 2
        logNRecursive(n); // recursive call to log function

        // O(log 8) example
        // log(8) --> 8 / 2 = 4
        // log(4) --> 4 / 2 = 2
        // log(2) --> 2 / 2 = 1
        // log(1) --> 1 / 2 (floor) = 0 --> return
        // so, we made 3 cycle till we archived 1 -->  log(2, 8) = 3
    }

    //  O(log n)
    public static void logNWhileLoop(double n) {
        int log = (int) n;
        int power = 0;

        while (n > 1) {
            n = Math.floor(n / 2);
            power += 1;
        }
        System.out.printf("power of O(log %s) is %s", log, power);
    }

    //  O(n log n)
    public static void nLogN(double n) {

        int y = (int) n;
        int power = 0;

        while (n > 1) { // O(log n)
            n = Math.floor(n / 2);
            power += 1;

            for (int i = 0; i < y; i++) { // O(n)
                System.out.println(i);
            }
        }
        System.out.printf("log %s is %s%n", y, power);
        System.out.printf("O(n * log n) --> O(%s * %s) --> O(%s)", y, power, y * power);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        nLogN(4);
    }
}
