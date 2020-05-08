package com.trainee.aizaz.java;

import java.util.Scanner;

/**
 * The purpose of this class is to print reverse of a string
 * Example:
 * input:this is StringReverse class
 * ouput:class StringReverse is this
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        //after entering string we are splittingwords at every space
        String[] sarr = str.split(" ");
        /**
         * This is the logic to print String in reverse order.
         */
        for (int i = sarr.length - 1; i >= 0; i--) {
            System.out.print(sarr[i] + " ");
        }
    }
}