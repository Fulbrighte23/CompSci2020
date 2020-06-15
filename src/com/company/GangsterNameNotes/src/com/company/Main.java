package com.company.GangsterNameNotes.src.com.company;

import com.company.Challenge1EricaJade;

public class Main {

    public static void main(String[] args) {
	// write your code here
            String name = "Erica";//writes name
            sayHi(name);
            Challenge1EricaJade.line();
            String teacher = "Maria Suarez the Teacher";
            sayHi(teacher);
            Challenge1EricaJade.line();
        }

        public static void sayHi(String name) {
            System.out.println("Hi " + name.toUpperCase());//this is to make it all uppercase
            System.out.println("Hi " + name);//this makes it say hi
            name = name.toLowerCase();//this puts our names in lowercase
            System.out.println("Hi " + name);
            int len = name.length(); //shows you the length of each word or phrase
            System.out.println("Your name is " + len + " characters long");
            int indexOf = name.indexOf("r"); // tells the index of that number
            System.out.println("The letter r is index" + indexOf);
            if (indexOf > 0) {
                String partial = name.substring(indexOf + 1);// give you thr string from that index to end
                System.out.println(partial);
                Challenge1EricaJade.line();

                if (name.length() > 4) {
                    partial = name.substring(1, indexOf);
                    System.out.println(partial);
                    char letter = name.charAt(4);
                    System.out.println("the letter at index 4 is " + letter);//these 3 lines give you the character at index 4
                }
            }
        }

    }

