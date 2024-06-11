package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter elements of Array:");
        for (int i = 0; i < array.length-2; i++) {
            array[i] = Integer.parseInt(scan.next());
        }
        System.out.println("Array of elements: " + Arrays.toString(array) + " ");
        System.out.println("Array in reverse:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

        // Array of lines in reverse order
        //
        //1. Create an array of 10 lines.
        //2. Enter 8 lines from the keyboard and store them in an array.
        //3. Display the contents of the entire array (10 elements) on the screen in reverse order.
        // Each element - from a new line.
