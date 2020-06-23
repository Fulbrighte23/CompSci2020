package com.company;
import java.util.*;
public class StringChallenge {
/* Erica Fulbright Pseudo Code
Ask how many lines of strings
create keyboard for user to type in their phrase
find length of word
if index of % the number of characters equals 1, it's odd. if equals 0. it's even
assign variable for first word that user types
assign variable for second word that user types
create a loop that finds the index of all of the letters in the first word. This will decide which phrase is even or odd
create a second loop that sees if each character's index is even or odd
create a variable for the even and odd and print


Need to get T// the number of words the user wants to be broken up
            // make sure that T is between 1-10
                <1 or>10
                print the requirements for the line above
                define T as answer (screen.next). answer = user input
            create a keyboard so that the person can type in the int for the number of lines and the 2 phrases

Use a for loop controlled by T
            ask user for a word
            declare the string = call method (newWord)
            print the new word (this is all for the first word)


Return Method (this has to be a string, not a void)
        String evenLetters
        String oddLetters
        find the length of the word using .length()
        int p = 0
        String length of evenLetter = N
        while loop with index control
}
for loop (control even +=2)//plus equal 2 is to go over every 2 letters, start with 0, insert word's length, then insert the +=2 aspect for the index
        evenLetter=

for loop (odd index start at 1 then count by 2)// do the same for the even but start with 1
        oddLetter=
}
Return evenLetter +" "+ oddLetter// returns back up to return method
 */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // makes it so that the person can type
        int T;
        System.out.print("Enter an integer between 1-10: ");
        T = keyboard.nextInt(); //lets person type number
        System.out.println("Enter " + T + " Words");

        String[] inputWords = new String[T];// array
        for (int count = 0; count < T; count++) {//counts how many times they've input a word
            inputWords[count] = keyboard.next(); // InputWords is the method!!
        }
        String[] outputWords = new String[T];// array
        for (int count = 0; count < T; count++) {//counts how many times they've input a word
            outputWords[count] = OutputWords(keyboard, inputWords[count]); // OutputWords is the method!!
        }
        System.out.println(" ");
        for (int count = 0; count < T; count++) {
            System.out.println(outputWords[count]);
        }
    }

    public static String OutputWords(Scanner keyboard, String inputWords) {
        String oddWord = "";
        String evenWord = "";
        for (int even = 0; even < inputWords.length(); even += 2) //Loop for even words
        {
            evenWord = evenWord + inputWords.charAt(even);
        }
        for (int odd = 1; odd < inputWords.length(); odd += 2)  //loop for odd words
        {
            char temp = inputWords.charAt(odd);
            oddWord = oddWord + temp;
        }
        String newWord = evenWord + " " + oddWord;
        return newWord;
    }
    }



