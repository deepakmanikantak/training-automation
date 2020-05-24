package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 * This class contains methods which can be re-usable for other classes
 * @author aizaz
 */
public class CommonMethods {
    /**
     * This method is used to insert elements into an array
     * instead of writing whole code in our program we are directly calling
     * this method for code reusability.
     */
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

    /**
     * this method is used to sort our array in descending order
     * it is taking array arr as parameter then after sorting
     * it is returning sorted array arr.
     *
     * @param arr
     * @return arr   (sorted arr)
     */

    public int[] sortedArrayDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //Logic for sorting in descending order
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * The below are the method ref(1,2,3) in which stream api concept has been used it is the feature of java 1.8
     * in which instead of using cursors we are using lamda expressions which helps us to reduce the code
     * the methods we use are:
     * stream()---->stream is a method which is present in java.util.stream.Collectors
     *              A stream does not store data and, in that sense, is not a data structure.
     *              It also never modifies the underlying data source
     *              This functionality – java.util.stream – supports functional-style
     *              operations on streams of elements,
     *              such as map-reduce transformations on collections.
     *
     * map() -------->produces a new stream after applying a function to each element
     *              of the original stream.
     *       -------->Basically when we use map() is when we want to perform any kind of
     *                changes to our elements of collections then we need to go for
     *                map().
     *
     * filter()------>this produces a new stream that contains elements of the original stream
     *                 that pass a given test.
     *         ------->in this method we give conditions the elements which satisfy those
     *                 condtions are filtered out.
     *
     * collect()------>it is used to get elements out of the stream once we are done
     *                  with all the processing.
     *          -------> this operation is provided via the Collector interface implementation.
     *
     * sorted()-------->this method is used to sort the elements in ascending or descending order
     *                  using compareTo method(i1.compareTo(i2)) which is used to compare one element
     *                  with other and sort it accordingly.
     */

    //1---stream reference
    /**
     * In this method we are filtering our collection elements which are even
     * using filter() method in which we are giving the condition.
     *
     * @param al (ArrayList al)
     * @return l (List l)
     */
    public List filterEven(ArrayList<Integer> al) {
        List<Integer> l = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        return l;
    }

    //2--stream reference:
    /**
     * In this method we are sorting our collection elements in ascending order
     * using sorted() methodand then sorting using compareTo(0 method
     *
     * @param al (ArrayList al)
     * @return l (List l)
     */
    public List ascendingLamda(ArrayList<Integer> al) {
        List<Integer> l = al.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
        return l;
    }

    //3---sorted reference

    /**
     * In this method we are sorting our collection elements in desscending order
     * using sorted() methodand then sorting using compareTo()method
     *
     * @param al (ArrayList al)
     * @return l (List l)
     */
    public List descendingLamda(ArrayList<Integer> al) {
        List<Integer> l = al.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        return l;
    }
}