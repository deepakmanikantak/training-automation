package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
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
        /**
         * Here we are using map() to add the marks
         * For complete refernce of map() method refer CommonMethods class.
         */
        List<Integer> l = al.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(l);
        /**
         * IF WE DON'T USE THESE LAMDA EXPRESSIONS WE HAVE TO GO WITH CURSORS
         * WHICH WILL INCREASE THE LENGHTH OF THE CODE.SO BELOW IS THE EXAMPLE
         * WITH CURSORS
         */
        System.out.println("WITHOUT STREAM API");
        ListIterator litr = al.listIterator();
        while (litr.hasNext()) {
            Integer i = (Integer) litr.next();
            System.out.println(i);
            litr.set(i + 5);
        }
        System.out.println(al);
    }
}