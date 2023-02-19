package com.bridgelabzrevieve1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the num:");
        num = scan.nextInt();
        //int num = 122;
        int remainder,reverse = 0;
        int temp = 0;
        temp = num;
        //System.out.println("enter the value of num");
        while (num > 0) {
           remainder = num % 10;
          reverse = reverse * 10 + remainder;
          num = num / 10;
        }
        if (temp == reverse){
            System.out.println("the number is palindrome ");
        }else{
            System.out.println("the number is not palindrome ");
        }

    }
}