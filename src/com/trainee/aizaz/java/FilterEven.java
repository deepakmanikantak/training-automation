package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * the purpose of this class is to filter the even numbers using lamda expressions
 * and using filter() method.
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
        /**
         * here are we are calling filterEven method which is CommonMethods class
         *for complete refernce of documentation refer CommonMethod class
         */
        List<Integer> l = f.filterEven(al);
        System.out.println(l);

        /**
         * IF WE DON'T USE THESE LAMDA EXPRESSIONS WE HAVE TO GO WITH CURSORS
         * WHICH WILL INCREASE THE LENGHTH OF THE CODE.SO BELOW IS THE EXAMPLE
         * WITH CURSORS
         */
        System.out.println("WITHOUT STREAM API");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                itr.remove();
            }
        }
        System.out.println(al);
    }
}