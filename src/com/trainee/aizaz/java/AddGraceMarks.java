package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * purpose of this class is to add 5 grace marks
 * by using map() method
 *
 * @author aizaz
 */
public class AddGraceMarks {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(90);
        al.add(25);
        al.add(65);
        al.add(88);
        al.add(70);
        System.out.println(al);
        //ADDING 5 GRACE MARKS:
        List<Integer> l = al.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(l);

    }
}
