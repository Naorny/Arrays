package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneLargeTwoSmall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] large_array = new String[20];
        System.out.println("Enter 20 elements of Large Array:");
        for (int i = 0; i < large_array.length; i++) {
            large_array[i] = scan.nextLine();
        }
        System.out.println("Large array of 20 elements: " + Arrays.toString(large_array) + " ");

        String[] array1 = new String[10];
        String[] array2 = new String[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = large_array[i];
        }
        System.out.println("The second small array is:");
        for (int i = 0; i < array2.length; i++) {
            int a = i+10;
            array2[i] = large_array[a];
            System.out.println(array2[i]);
        }
    }
}


            // One large array and two small arrays
            //
            //1. Create an array for 20 numbers.
            //2. Enter values into it from the keyboard.
            //3. Create two arrays of 10 numbers each.
            //4. Copy the large array into two small arrays: half of the numbers into the first small array, the other half into the second small array.
            //5. Display the second small array on the screen, each value on a new line.
