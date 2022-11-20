package com.bridgelabz;

public class SumOfNaturalNum {
    static void checkSum(){
        int n=5,i=1,sum=0;

        while (i<=n ){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        System.out.println("Enter a Digit For Sum Of Number");
        checkSum();

    }
}
