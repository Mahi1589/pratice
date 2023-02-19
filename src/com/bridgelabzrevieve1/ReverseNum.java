package com.bridgelabzrevieve1;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 123456;
        int reverse = 0;
        //System.out.println("enter the value of num");
        while(num != 0){
           int  remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
            System.out.println("the reverse of a given number is " + reverse);
        }
    }
}
