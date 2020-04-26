package com.trainee.aizaz.java;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this class contains program where one element is accepted and
 * found out how many times it has been repeated in the array
 *
 * @author aizaz
 */
public class CountElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element which is to be counted:");
        try {
            int a = sc.nextInt();
            System.out.println("enter the size of the array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;
            //insertion of elements in array:
            for (int i = 0; i < n; i++) {
                System.out.println("enter the elemnt for arr[" + i + "]:");
                arr[i] = sc.nextInt();
                //logic for counting:
                if (arr[i] == a) {
                    count++;
                }
            }
            System.out.println("the number of times the element has repeated is: " + count);
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
