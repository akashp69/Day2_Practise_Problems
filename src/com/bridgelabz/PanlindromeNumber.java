package com.bridgelabz;

public class PanlindromeNumber {
    public static void main(String[] args) {


        int number = 343, palindrome = 0;
        for (; number != 0; ) {
            int remainder = number % 10;
            palindrome = palindrome * 10 + remainder;
            number = number / 10;
        }

        System.out.println("The given number is Palindrom: " + palindrome);

    }
}