package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This class contains methods which can be re-usable for other classes
 */
public class CommonMethods {
    public int[] arraySet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //insertion of array elements:
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int[] sortedArrayDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //Logic for sorting in ascending order
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //method for filtering even numbers in collections(lamda expressions)
    public List filterEven(ArrayList<Integer> al) {
        List<Integer> l = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        return l;

    }

    //method for sorting in ascending order using lamda expressions
    public List ascendingLamda(ArrayList<Integer> al) {
        List<Integer> l = al.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
        return l;

    }

    //method for sorting in descending order using lamda expressions
    public List descendingLamda(ArrayList<Integer> al) {
        List<Integer> l = al.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        return l;

    }
}