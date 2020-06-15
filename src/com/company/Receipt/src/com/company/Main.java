package com.company.Receipt.src.com.company;

public class Main {

        public static void main(String[] args) {
            double subtotal = (38 + 40 + 30);
            final double Tax = .08;
            double Tip = .15;
            double finalTax = (subtotal * Tax);
            double finalTip = (subtotal * Tip);
            double Total = (subtotal + finalTip + finalTax);

            System.out.println("Subtotal:" + subtotal);
            System.out.println("finalTax:" + finalTax);
            System.out.println("finalTip:" + finalTip);
            System.out.println("Total:" + Total);
        }
    }



