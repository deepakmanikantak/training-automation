package com.trainee.aizaz.java;

import java.util.Scanner;

/**
 * the purpose of this class is to print reverse of string along
 * with reverse of its words.
 */
public class StringAlongWithWordsReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        String[] sarr = str.split(" ");
        for (int i = sarr.length - 1; i >= 0; i--) {
            char[] carr = sarr[i].toCharArray();
            for (int j = carr.length - 1; j >= 0; j--) {
                System.out.print(carr[j]);
            }
            System.out.print(" ");
        }
    }
}