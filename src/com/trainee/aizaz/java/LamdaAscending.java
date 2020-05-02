package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.List;

/**
 * the purpose of this class is to show ascending order using lamda expressions
 * by using sorted() and compareTo() methods
 *
 * @author aizaz
 */

public class LamdaAscending extends CommonMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        LamdaAscending la = new LamdaAscending();
        al.add(90);
        al.add(25);
        al.add(65);
        al.add(88);
        al.add(70);
        System.out.println(al);
        List<Integer> sort = la.ascendingLamda(al);
        System.out.println(sort);

    }
}