package com.company;
import java.util.*;
/* Erica Fulbright PseudoCode
-import scanner
-create main
    ---CREATE AND DECLARE NUM GENERATOR FOR ARRAY
    ---Make the Array (this will determine how many numbers will be in the array)
        ---Declare int num = new int
    -make a for loop (i)
    -Create random number (bound 5) + 5
    -Make method swap
        -Create a new random generator that determines which indexes to swap (randIndex1)
        -Make a second random number that'll swap with the first (randIndex2)
        - int temp = array[i]; //find first value
                array[i] = array[array.length - i]; //make last value first value
                array[array.length - i] = temp;
    -Print the og and swapped arrays
 */
public class indexArraySwapClasswork {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(5) + 5; // this will determine the size of the array
        int[] array = new int[size]; //this creates the array
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(89) +10;
        }
        System.out.println(Arrays.toString(array));
        int index1;
        int index2;
        do{
            index1= rand.nextInt(size);
            index2= rand.nextInt(size);
        }while(index1==index2);
        swap(array, index1, index2);
        System.out.println(Arrays.toString(array));

        }
    public static int[] swap ( int[] array, int i, int j) { //swaps 2 random indexes in array
        Random rand = new Random();
        int temp = array[i]; //find first value
        array[i] = array[j]; //make last value first value
        array[j] = temp;
        return array;
    }
}
