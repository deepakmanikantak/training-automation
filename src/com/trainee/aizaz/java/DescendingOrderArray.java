package com.trainee.aizaz.java;
import java.util.InputMismatchException;

/**
 * The purpose of this program is to sort the elements in desending order
 *
 * @author aizaz
 */

public class DescendingOrderArray extends CommonMethods {
    public static void main(String[] args) {
        try {
            DescendingOrderArray d = new DescendingOrderArray();
           //here we are using methods which are in CommonMethods class
            int[] arr = d.sortedArrayDescending(d.arraySet());
            for (int e : arr) {
                /**
                 * The purpose of using print instead of println
                 *is to show all sorted elements in same line
                 *with space
                 */
                System.out.print(e + " ");
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