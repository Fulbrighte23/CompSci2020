package com.company;
   import java.util.Scanner;
    public class ChallengeDataTypes {

        public static void main(String[] args) {
            Scanner number = new Scanner(System.in);
            String answer;
            int i = 4;
            double d = 4.0;
            String s = "Greenhill";

            System.out.println("Type your integer:");
            int MyInt = number.nextInt();// makes it so that you can type the number
            int MyInt2 = (MyInt + i);
            System.out.println("i plus your integer is " + MyInt2);

            System.out.println("Type your Double:");
            double MyDouble = number.nextDouble();
            double MyDouble2 = (MyDouble + d);
            System.out.println("d plus your double equals " + MyDouble2);

            System.out.println(s);
            Scanner keyboard = new Scanner(System.in);
            String MyString = keyboard.next();
            String MyString2 = (s + " " + MyString);
            System.out.println("Your new phrase is " + MyString2);
        }
    }


