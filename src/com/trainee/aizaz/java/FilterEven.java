package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.List;

/**
 * the purpose of this class is to filter the even numbers using lamda expressions
 * and using filter() method
 *
 * @author aizaz
 */
public class FilterEven extends CommonMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        FilterEven f = new FilterEven();
        al.add(1);
        al.add(2);
        al.add(15);
        al.add(8);
        al.add(10);
        System.out.println(al);
        //filtering even numbers
        List<Integer> l = f.filterEven(al);
        System.out.println(l);

    }
}