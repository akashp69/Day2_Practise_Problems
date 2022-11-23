package com.bridgelabz;

public class ReverseNumber {
    static void checkReverse(){
        int number = 143,reverse=0;
        System.out.println(n);
        while (n>0){
            int remainder=n%10;
            reverse =reverse*10+remainder;
            number=number/10;
        }
        System.out.println(reverse);

    }

    public static void main(String[] args) {

        System.out.println("Displaying Reverse Number");
        checkReverse();
    }
}