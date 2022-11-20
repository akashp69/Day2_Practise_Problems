package com.bridgelabz;

public class ReverseNumber {
    static void checkReverse(){
        int n = 143,R=0;
        System.out.println(n);
        while (n>0){
            int remainder=n%10;
            R=R*10+remainder;
            n=n/10;
        }
        System.out.println(R);

    }

    public static void main(String[] args) {
        System.out.println("Displaying Reverse Number");
        checkReverse();
    }
}