package com.trainee.aizaz.java;
import java.util.Scanner;
/**
 * The purpose of this class is to convert string into uppercase
 */
public class ConvertingStringToUpperCase {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        /**
         * toUpperCase() is the method used to convert string into uppercase.
         */
        String str2=str.toUpperCase();
        System.out.println(str2);
    }
}