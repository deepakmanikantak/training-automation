package com.trainee.aizaz.java;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 * The purpose of this class is to get collection objects one by one
 * in reverse oder using cursors.
 */
public class TraversingInCollections {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("alan");
        al.add("morries");
        al.add("john");
        al.add("tom");
        ListIterator<String> litr = al.listIterator(al.size());
        /**
         * we are using hsaPrevious() to get collection object in reverse order:
         */
        while (litr.hasPrevious()) {
            String str = litr.previous();
            System.out.println(str);
        }
    }
}