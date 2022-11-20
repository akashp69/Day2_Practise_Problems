package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a letter");
        char c;
        Scanner sc = new Scanner(System.in);
        c=sc.next().charAt(0);
        char ch=c;

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
