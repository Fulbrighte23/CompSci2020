package com.company;


public class GangsterName {
   //lets you use other programs that people have a;ready had
/*Write a program that outputs a person's "gangsta name."
–first initial/ char letter = name.charAt(0)
System.out.print(letter + ". Diddy"
–Diddy
–last name (all caps)
–first name
–-izzle
Example Output:
Type your name, playa: Marge Simpson
Your gangsta name is "M. Diddy SIMPSON Marge-izzle"*/

    public static void main(String[] args) {
        String name = "Erica Fulbright";
        String lastName = "Fulbright";
        //Challenge1EricaJade.line();
        char letter = name.charAt(0);//will print E
        System.out.print(letter + ". Diddy");
        String partial;
        int indexOf = name.indexOf("F");
        if (indexOf > 0) {
            partial = name.substring(indexOf);
            partial = lastName.toUpperCase();
            System.out.print(" " + partial);
            String firstName = " Erica";
            System.out.print(firstName + " Izzle");
        }
    }
}

