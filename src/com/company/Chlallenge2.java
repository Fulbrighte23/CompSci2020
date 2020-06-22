package com.company;

public class Chlallenge2 {
    public static void main(String[] args) {
        line();

        line();

    }

    public static void line() {
        System.out.print("+");
        for (int dash = 1; dash <5*2; dash++) ;
        System.out.print("-");
        System.out.print("+");
    }
}