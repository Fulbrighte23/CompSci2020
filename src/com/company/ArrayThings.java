package com.company;
import java.util.*;

/* Erica Fulbright PseudoCode
-Import scanner
-Ask user how many days there will be weather
        -Add 1 to that variable
-Set up random number generator (between 25 and 110)
- Create a loop that repeats however many times that the user's variable is
-System.print each days' high temperature
-Print the average of all the days

(ADDITION TO PSEUDOCODE)
-Set up an array statement for (Temp at Day x: Rand
-Create a variable for x and increase it by 1 each time
-Replace rand with a new rand each time
-Print this in a for loop that goes as many times as the user asks you to
 */
public class ArrayThings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random(86 + 25);
        int userDays; //the number of days they input
        do {
            System.out.print("How many days' temperature? (Between 2 and 100): ");
            userDays = keyboard.nextInt();
        } while (userDays < 2 || userDays >= 100);
        int[] temp = new int[userDays];
        int total = 0;
        for (int x = 0; x < userDays; x++) { // x is a placeholder. this loop is for the days
            temp[x] = rand.nextInt(86) + 25;
            System.out.println("On Day" + (x + 1) + "the highest temperature was: " + temp[x]);
            total = total + temp[x];
        }
        double average = (double) total / userDays;
        System.out.println("The average temperature is: " + average);
        int count = 0; //number of days above average
        for (int x = 0; x < userDays; x++) { // x is a placeholder. this loop is for the days
            if (temp[x] > average) {
                count++;
            }
        }
        System.out.println("There are " + count +" Days above average");
    }
}

