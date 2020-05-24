package com.trainee.aizaz.java;
import java.util.Enumeration;
import java.util.Vector;

/**
 * The purpose of this class is to show enumeration concept
 * purpose of Enumeration:
 * We can use Enumeration to get objects one by one from the legacy collection classes.
 * Limitations:
 * 1.)We can apply Enumeration concept only for legacy classes & it is not a universal cursor.
 * 2.)To overcome this limitation we use Iterator concept.
 */

public class EnumeratorDataRetrive {
    public static void main(String[]args){
        Vector<Integer>v=new Vector<Integer>();
        v.addElement(1);
        v.addElement(5);
        v.addElement(100);
        v.addElement(975);
        v.addElement(2);
        v.addElement(75);
        System.out.println(v);
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            Integer i=(Integer) e.nextElement();
            System.out.println(i);
        }
    }
}