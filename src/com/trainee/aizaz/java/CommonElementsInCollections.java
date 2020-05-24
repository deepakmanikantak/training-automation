package com.trainee.aizaz.java;
import java.util.ArrayList;

public class CommonElementsInCollections {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(100);
        al.add(500);
        al.add(44);
        System.out.println(al);
        al2.add(100);
        al2.add(2);
        al2.add(6);
        al2.add(8);
        al2.add(44);
        System.out.println(al2);
        al.retainAll(al2);
        System.out.println("Array1 after retaining common elements of array2 & array1" + al);
    }
}