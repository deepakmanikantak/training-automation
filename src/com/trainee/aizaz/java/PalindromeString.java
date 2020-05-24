package com.trainee.aizaz.java;
import java.util.Scanner;

/**
 * this purpose of this class is to find whether the string is palindrome or not
 */
public class PalindromeString {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        int length=str.length();
        boolean result=true;
        /**
         * how we are comparing is
         * for example the length of string is 5 means no of index =4(0-4)
         * so we are comapring left side character with the right side characters
         * charAt(index 0)!=charAt(index 5-0-1=4)
         * so if result doesn't matches it will return false
         */
        for(int i=0;i<=length/2;i++){
            if(str.charAt(i)!=str.charAt(length-i-1)){
                result=false;
            }
        }
        System.out.println(str+" is palindrome="+result);
    }
}