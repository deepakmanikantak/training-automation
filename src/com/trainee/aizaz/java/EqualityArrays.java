package com.trainee.aizaz.java;
import java.util.InputMismatchException;

public class EqualityArrays extends CommonMethods {
    public static void main(String[] args) {
        EqualityArrays ea = new EqualityArrays();
        try {
            int[] arr1 = ea.arraySet();

            int[] arr2 = ea.arraySet();
            boolean statement = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    statement = false;
                }
            }
            if (statement == true) {
                System.out.println("The arrays are equal");
            } else {
                System.out.println("The arrays are not equal");
            }
        } catch (InputMismatchException ime) {
            //FOR ARRAY ELEMENTS
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            //FOR ARRAY SIZE
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numericals Allowed");
        }
    }
}