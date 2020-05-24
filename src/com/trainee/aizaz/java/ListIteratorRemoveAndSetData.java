package com.trainee.aizaz.java;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * The purpsose of this class is to show ListIterator Concept
 *  While using ListIterator we can perform replacement and addition of new objects
 *  in addition to read & remove operations.
 */
public class ListIteratorRemoveAndSetData {
    public static void main(String[]args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("alan");
        al.add("john");
        al.add("joe");
        al.add("steve");
        al.add("smith");
        System.out.println(al);
        ListIterator<String>litr=al.listIterator();
        while(litr.hasNext()){
            String s=(String)litr.next();
            if(s.equals("smith")){
                litr.set("david");
            }
           }
        System.out.println(al);
    }
}