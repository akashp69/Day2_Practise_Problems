package com.bridgelabz;

public class PanlindromeNumber {
    public static void main(String[] args) {


        int num = 343, p = 0;
        for (; num != 0; ) {
            int remainder = num % 10;
            p = p * 10 + remainder;
            num = num / 10;
        }

        System.out.println("The given number is Palindrom: " + p);

    }
}