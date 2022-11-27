package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
    /**
    *This Method Created For Checking The Letter Is Vowel Or Consonant
    */
    public static void main(String[] args) {
        System.out.println("Enter a letter");
        char c;
        Scanner scanner = new Scanner(System.in);
        c=scanner.next().charAt(0);
        char ch=c;
    /**
    *Using Switch Case For campair Character is vowel or consonant 
    */

        switch (ch) {
            case 'a':
                System.out.println("a is Vowel");
                break;
            case 'e':

                System.out.println("e is Vowel");
                break;
            case 'i':
                System.out.println("i is Vowel");
                break;
            case 'o':
                System.out.println("o is Vowel");
                break;
            case 'u':
                System.out.println("u is Vowel");
                break;
            default:
                System.out.println("Given Letter Is Consonant");
        }
    }
}
