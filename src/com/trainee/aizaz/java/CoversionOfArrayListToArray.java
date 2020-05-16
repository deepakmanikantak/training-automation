package com.trainee.aizaz.java;
import java.util.ArrayList;
public class CoversionOfArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        //converting ArrayList to Array:
        Object[] obj = al.toArray();
        for (Object object : obj) {
            System.out.print(object + " ");
        }
    }
}