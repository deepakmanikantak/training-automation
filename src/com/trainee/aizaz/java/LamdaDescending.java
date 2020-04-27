package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.List;

/**
 * the purpose of this class is to show descending order using lamda expressions
 *by using sorted() and compareTo() methods
 *
 * @author aizaz
 */

public class LamdaDescending {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        LamdaAscending la = new LamdaAscending();
        al.add(81);
        al.add(25);
        al.add(76);
        al.add(48);
        al.add(100);
        System.out.println(al);
        List<Integer> sort = la.descendingLamda(al);
        System.out.println(sort);
    }
}