package com.bridgelabz;

public class ReverseNumber {
    /**
    *This Static Method Created For  the Given Number Print in  Reverse
    */
    static void checkReverse(){
        int number = 143,reverse=0;
        System.out.println(n);
    /**
    *Using While Loop For Reversing the Given Number
    */
        while (n>0){
            int remainder=n%10;
            reverse =reverse*10+remainder;
            number=number/10;
        }
     /**
    *Print Number in Reverse Order
    */
        System.out.println(reverse);

    }
    /**
    *This Method Created For Calling the Static Method checkReverse
    */

    public static void main(String[] args) {

        System.out.println("Displaying Reverse Number");
        checkReverse();
    }
}
