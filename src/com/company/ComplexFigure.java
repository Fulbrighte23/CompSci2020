package com.company;

public class ComplexFigure {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        //call all my functions
        line();
        top();
        bottom();
        line();
    }

    public static void line() {
        System.out.print("#");
        //define the var
        //initialize it
        //    declare var  value    increment
        for (int dash = 0; dash <4*SIZE; dash++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void top() {
        for (int line = 1; line < SIZE + 1; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -2*line + 2*SIZE; spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4*line-4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= -2* line + 2 * SIZE; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void bottom() {
        for (int line = 1; line < SIZE + 1; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= 2*line - 2; spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <=-4*line +8*SIZE/2; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= 2*line -2; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }


}
