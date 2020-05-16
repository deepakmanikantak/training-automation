package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 * the purpsose of this class is to show Iterator Concept
 *1.)we can aplly iteratorconcept for any collection object and it is a universal cursor.
 * 2.)While iterating the objects by iterator we can perform both read and remove operations.
 */
public class IteratorReadandRemoveData {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(50);
        al.add(100);
        al.add(15);
        al.add(200);
        al.add(25);
        al.add(300);
        System.out.println(al);
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