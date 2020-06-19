package com.company;
import java.util.Scanner;
public class Main {

    /*Erica Fulbright Challenge Operators Pseudo Code
    Import scanner
    Create a variable for MealCost, TipPercent, and TaxPercent
    Make them keyboard
    Create lines of code that calculates TotalCost by adding all 3 variables
    Print out result
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Cost of meal: ");
        double mealCost = keyboard.nextDouble();
        System.out.print("Tip percent: ");
        int tipPercent = keyboard.nextInt();

        static double solve (double mealCost, int tipPercent, double totalCost){
        double taxCost = (mealCost*.0625);
        double tipCost = (tipPercent*.01)*mealCost;
        double totalCost = (int) (mealCost+tipCost+taxCost);
        System.out.print("Total cost: $" + totalCost);
    }
}
