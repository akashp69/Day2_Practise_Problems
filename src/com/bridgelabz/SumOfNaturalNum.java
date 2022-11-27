package com.bridgelabz;


public class SumOfNaturalNumber {
    /**
    *This Static Method Created For Sum Of Natural Numbers
    */
    static void checkSum(){
        int number=5,integer=1,sum=0;
    /**
    *Using While Loop For Sum Of Naturals  Numbers 
    */

        while (integer<=number ){
            sum=sum+i;
            i++;
        }
    /**
    *Print The sum Of Naturals Numbers
    */
        System.out.println(sum);
    }
    /**
    *This Method Created For Calling The Static Method checkSum
    */

    public static void main(String[] args) {
        checkSum();
    }
}
