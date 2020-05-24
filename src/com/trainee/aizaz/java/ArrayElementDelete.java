package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * the purpose of the program is to delete a element from an array
 */
public class ArrayElementDelete extends CommonMethods {
    public static void main(String[] args) {
        ArrayElementDelete a = new ArrayElementDelete();
        try {
            int[] arr = a.arraySet();
            System.out.println(Arrays.toString(arr));
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE ELEMENT TO BE DELETED : ");
            int ele = sc.nextInt();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ele) {
                    count++;
                }
            }
            int[] arr2 = new int[arr.length - count];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != ele) {
                    arr2[j] = arr[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(arr2));
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