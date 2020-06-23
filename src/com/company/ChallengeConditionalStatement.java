package com.company;
import java.util.*;
public class ChallengeConditionalStatement {
    private static Scanner keyboard;

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
        System.out.print("Do you want to play the game(Yes or No): ");
        String answer = keyboard.next();
        keyboard.nextLine();
        while (answer.contains("Y")) {
            //solve(keyboard);
            System.out.print("Do you want to play the game(Yes or No): ");
            answer = keyboard.next();
        }
        System.out.print("Game Over");
        while (answer.contains("y")) ; // if answer is yes, then it will continue
    }

    private static void solve( int number) {
    System.out.print("Type a number between 1-137");
        if (number < 1 || number > 137) {
            System.out.print("Make sure to type a number between 1-137");
            int answer = keyboard.nextInt();
          //  solve();
        }
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




