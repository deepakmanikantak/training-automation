package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * this purpose of this programme is to find sum of pair of array
 * which is closest to zero.
 */
public class TestClosestToZero {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("arr[" + i + "]");
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            int minSum = arr[0] + arr[1];
            int ele1 = arr[0];
            int ele2 = arr[1];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = arr[i] + arr[j];
                    /**
                     * Here why we are comparing minSum with sum and if minimum
                     * is greter than sum then minimum sum =sum;
                     * WHY abs(sum)??????
                     * Because here we are comparing minimum sum with absolute sum and
                     * it is not compulsary that closest value is minimum value so while
                     * comparing we are making it positive and then comparing.
                     */
                    if (Math.abs(minSum) > Math.abs(sum)) {
                        minSum = sum;
                        ele1 = arr[i];
                        ele2 = arr[j];
                    }
                }
            }
            System.out.println(ele1 + "   " + ele2 + "  " + minSum);
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numners Allowed");
        }
    }
}