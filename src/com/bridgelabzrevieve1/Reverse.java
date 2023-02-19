package com.bridgelabzrevieve1;

public class Reverse {
    public static void main(String[] args) {
        String string  = "lmn";
        String reversedstr = " ";
        //System.out.println("lmn");

        for (int i = string.length() - 1; i >= 0; i --) {
            reversedstr = reversedstr + string.charAt(i);

        }
        System.out.println("original string " + string);
        System.out.println("Reverse the given string" +reversedstr);
    }
}

