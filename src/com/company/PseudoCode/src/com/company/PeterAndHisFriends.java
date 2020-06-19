package com.company.PseudoCode.src.com.company;
import java.util.*;

public class PeterAndHisFriends {


    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();

        int indexOf = phrase.indexOf(" ");
        String FirstWord = phrase.substring(0, indexOf + 1);// scans the phrase // firstWord is the method. firstWord is the actual first word
        int len = FirstWord.length();//finds length of phrase
        System.out.println(" First word is " + len + " characters long");
        char letter = 0;
        int count = 0;
        for (int index = 0; index < FirstWord.length(); index++) {
            letter = FirstWord.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = phrase.substring(index + 1);
                len = temp.indexOf(letter);
                while (len >= 0) {
                    count++;
                    //System.out.println(temp + " " + indexOf);
                    temp = temp.substring(len + 1);
                    len = temp.indexOf(letter);
                }
                //find rest of the letter of your message
                // count = Method restProg(letter,phrase, count)
            }
            FirstWord = FirstWord.replace(letter, ' ');
            System.out.println(letter + " " + count);
            count = 0;
        }
    }
}







