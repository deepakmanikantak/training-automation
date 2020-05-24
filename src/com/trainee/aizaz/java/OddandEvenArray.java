package com.trainee.aizaz.java;
import java.util.InputMismatchException;

/**
 * THE PURPOSE OF THIS CODE IS TO PRINT ODD AND EVEN NUMBERS
 * @author aizaz
 */

public class OddandEvenArray extends CommonMethods {
    public static void main(String[] args) {
        OddandEvenArray oea = new OddandEvenArray();
        try {
            //inserting elements into the array
            int[] arr = oea.arraySet();
            System.out.println("even numbers");
            //logic for printing even numbers
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    /**
                     * The purpose of using print instead of println
                     *is to show all sorted elements in same line
                     *with space
                     */
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println(" ");
            System.out.println("odd numbers");
            //logic for printing odd nummbers:
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    /**
                     * The purpose of using print instead of println
                     *is to show all sorted elements in same line
                     *with space
                     */
                    System.out.print(arr[i] + " ");
                }
            }
        } catch (InputMismatchException ime) {
            //FOR ARRAY ELEMENTS
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            //FOR ARRAY SIZE
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numbers Allowed");
        }
    }
}