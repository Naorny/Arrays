package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        max(initializeArray());
    }
        // Maximum among an array of 20 numbers
        //
        //1. In the initializeArray() method:
        //1.1. Create an array of 20 numbers
        //1.2. Read 20 numbers from the console and fill the array with them
        //2. The max(int[] array) method should find the maximum number from the array elements

        public static int[] initializeArray() {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];

        System.out.println("Enter elements of Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scan.next());
        }
        System.out.println("Array of elements: " + Arrays.toString(array) + " ");
        return array;
    }

        static void max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Max element is :" + max);
    }
}


