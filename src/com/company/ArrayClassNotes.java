package com.company;
import java.util.*;
public class ArrayClassNotes {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 54, 6, 4, 79, 43, 11};
        //without the Arrays.toStrong on the bottom, it'll only print the address of the numbers
        int len = numbers.length;
        System.out.println("The array " + Arrays.toString(numbers) + " has " + len + " elements");
        // good way to make a quick print of the data
        Random rand = new Random(); // This is only to create the object
        int[] num2 = new int[6];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = rand.nextInt(70) + 20; // bound is always the range of your values + min
        }
        System.out.println("Original Array" + Arrays.toString(num2));
        num2= reverse(num2);
        System.out.println("Flipped Array" + Arrays.toString(num2));

    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
                int temp = array[i]; //find first value
                array[i] = array[array.length - i]; //make last value first value
                array[array.length - i] = temp;
        }
        return array;
    }
}
