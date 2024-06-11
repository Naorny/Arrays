package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReversNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter elements of Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Array of elements: " + Arrays.toString(array) + " ");
        System.out.println("Array in reverse:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

        // Array of numbers in reverse order
        //
        //1. Create an array of 10 numbers.
        //2. Enter 10 numbers from the keyboard and write them into the array.
        //3. Arrange the elements of the array in reverse order.
        //4. Display the result on the screen, each value on a new line.

