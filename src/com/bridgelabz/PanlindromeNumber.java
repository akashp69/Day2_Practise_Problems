package com.bridgelabz;

public class PanlindromeNumber {
    /**
    *This Method Created For Check The Number Is Palindrome 
    */
    public static void main(String[] args) {


        int number = 343, palindrome = 0;
    /**
    *Using For check Palindrome Number
    */
        for (; number != 0; ) {
            int remainder = number % 10;
            palindrome = palindrome * 10 + remainder;
            number = number / 10;
        }

        System.out.println("The given number is Palindrom: " + palindrome);

    }
}
