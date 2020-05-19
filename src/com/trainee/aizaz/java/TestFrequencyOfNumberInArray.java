package com.trainee.aizaz.java;
import java.util.ArrayList;
/**
 * the purpose of this code is to print how many times numbers have repeated in the array.
 */
public class TestFrequencyOfNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 2, 3, 3, 1, 2};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            /**
             * Here what i am doing is i am adding element in arraylist which has been counted and printed
             * so that if we get same element which has already been printed we can compare it with the elements
             * which are in arraylist and we dont allow that element to be printed by using below if condition.
             * Basically we are avoiding duplicate value frequencies!!!
             */
            if (count > 0 && !al.contains(arr[i])) {
                System.out.println("the frequency of" + arr[i] + "is: " + count);
                al.add(arr[i]);
            }
        }
    }
}