package org.arrays;

import java.util.Scanner;

public class TwoArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array1 = new String[4];
        System.out.println("Enter 10 elements of Array with rows:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scan.nextLine();
        }

        int[] array2 = new int[4];
        System.out.println("Enter 10 elements of Array with numbers:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scan.nextInt();
        }
        System.out.println("Display for each number cell the length of element from array with strings: ");
        for (int i = 0; i < array2.length; i++) {
            int length_array1 = array1[i].length();
            System.out.println("The cell of " + array2[i] + " contains " + length_array1 + " element(s)");
        }

    }
}

       // 2 arrays
       //
       //1. Create an array with 10 rows.
       //2. Create an array for 10 numbers.
       //3. Enter 10 strings from the keyboard, fill the array of strings with them.
       //4. In each cell of the array of numbers, write the length of the string
       //from the array of strings whose index/cell number matches the current index
       //from the array of numbers.
       //5. Display the contents of the number array on the screen, with each value displayed on a new line
