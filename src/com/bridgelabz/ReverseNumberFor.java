package com.bridgelabz;

public class ReverseNumberFor {
    public static void main(String[] args) {
        int num = 451, r = 0;
        for(;num != 0;)
        {
            int remainder = num % 10;
            r = r * 10 + remainder;
            num=num/10;
        }
        System.out.println("The reverse of the given number is: " + r);
    }
}
