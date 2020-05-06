package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * the purpose of this class is to accept one element and delete that element
 */
public class DeleteArrayElement extends CommonMethods {
    public static void main(String args[]) {
        DeleteArrayElement d=new DeleteArrayElement();
        try {
            int[] arr = d.arraySet();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Element to be Deleted : ");
            int a = sc.nextInt();
            int count = 0;
            //logic for deleting element:
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == a) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print("Element Not Found");
            } else {
                int[] arr2 = new int[arr.length - count];
                int j = 0;
                System.out.println("Array Element Deleted");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != a) {
                        arr2[j] = arr[i];
                        j++;
                    }
                }
                System.out.println("array after deleting element"+Arrays.toString(arr2));
            }
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numners Allowed");
        }
    }
}