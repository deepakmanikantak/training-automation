package com.trainee.aizaz.java;
import java.util.Scanner;
/**
 * The purpose of the code is to show number of upper case letters,lower case letters
 * ,digits,spaces,words,special characters in a given string.
 */

public class NoOfDifferentCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        char[] carr = str.toCharArray();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int spaces = 0;
        int words = 1;
        int specialCharacters = 0;
        for (char c : carr) {
            if (c >= 'A' && c <= 'Z') {
                upperCase++;
            } else if (c >= 'a' && c <= 'z') {
                lowerCase++;
            } else if (c >= '0' && c <= '9') {
                digits++;
            } else if (c == ' ') {
                spaces++;
                words++;
            } else {
                specialCharacters++;
            }
        }
        System.out.println("No of Upper Case characters:" + upperCase);
        System.out.println("No of Lower Case characters:" + lowerCase);
        System.out.println("No of  digits:" + digits);
        System.out.println("No of Spaces:" + spaces);
        System.out.println("No of words:" + words);
        System.out.println("No of Special Characters:" + specialCharacters);
    }
}