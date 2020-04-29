package com.trainee.geetanjali.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * this class is used to replace an element in specified index
 *
 * @author geetanjali
 */
public class ReplaceElementInSpecifiedIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a position:");
        try {
            int n = s.nextInt();
            System.out.println("Enter size of an array:");
            int size = s.nextInt();
            String string[] = new String[size];
            System.out.println("Enter elements of the StringArray:");
            //read the array elements from user
            for (int i = 0; i < size; i++) {
                string[i] = s.next();
            }
            System.out.println(Arrays.toString(string));
            System.out.println("Enter a String to be placed:");
            String str = s.next();
            //it converts the array into arraylist
            ArrayList<String> al = new ArrayList<String>(Arrays.asList(string));
            //set method is used to replace an element in the specified index
            al.set(n, str);
            System.out.println(al);
        }
        //this block is used to catch an exception when we give negative index value
        catch (ArrayIndexOutOfBoundsException AIOBE) {
            System.out.println("Please!!Enter a positive number");
        }
        //this block is used to catch an exception when we give array size as negative
        catch (NegativeArraySizeException NASE) {
            System.out.println("Size of array can't be negative");
        }
    }
}



