package com.company.PRINTF.src.com.company;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		do { // makes these lines of code local
			double exp1 = 123.456;
			double exp2 = 456.789;
			double exp3 = 789.123;
			int num1 = (int) Math.sqrt(420);
			int num2 = (int) Math.abs(-50);
			int num3 = (int) Math.round(9.876);//taking away the math.round takes out the first whole number
			double exp4 = Math.random() * 10;
			System.out.printf("My random is %5d \n", (int) exp4);
			System.out.println("Do you want to quit");
			answer = input.next();
		}
			while (answer.equals("no")) ;
			//System.out.printf("Showing how to use printf \n %5.3f\n %5.3f \n%5.3f \n%3d \n%3d \n%2d", exp1, exp2, exp3, num1, num2, num3); //the 10 means that the number can use 10 spaces, .3 is the 3 decimals, and f means float
//f is for doubles and floats, whereas d means whole numbers.. the 10.3f is used for decimals
	}
}
