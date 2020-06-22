package com.company;
import java.util.*;
public class ChallengeConditionalStatement {
    /*
    Erica Fulbright Pseudo Code
    Have it so that the user can enter a integer using keyboard scanner
    Print Scanner
    type it so that number the user's number = number mod 0 then it's even. If the mod = 1, then it is odd
    create a while statement
    create if statement that sees if the integer is between 2-5 if even (not Weird)
    continue if statement
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random number = new Random(); //generates random number
        System.out.println("Your number is " + number);
        String answer = "";
        do {//do while
            int Random = number.nextInt(137) + 1; // now it's between 1-137
            solve(Random);
            System.out.println("Do you want to continues? Yes or No?: ");
            answer = keyboard.next();
        }
        while (answer.contains("y")); // if answer is yes, then it will continue
    }
    private static void solve(int number) { ;
        if (number % 2==0) {
            System.out.println("Weird");
        }
        if (number == 2 || number==4) {
            System.out.println("Not Weird");
        }
            if (number > 2 && number < 5) {
                System.out.println("Not Weird");
            } else if (number > 6 && number < 20) {
                System.out.println("Weird");
            } else {
                if (number <= 20);
            }{
                System.out.println("Not Weird");
        }
        }
    }




