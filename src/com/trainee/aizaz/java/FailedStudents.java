package com.trainee.aizaz.java;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

/**
 * the purpose of this program is to count number of failed students
 * by using filter() and count() methods
 * @author aizaz
 */
public class FailedStudents {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(25);
        al.add(15);
        al.add(98);
        al.add(20);
        al.add(55);
        System.out.println(al);
        /**
         * here we are filtering out the students who have failed and counting them using
         * count() method.
         * for complete reference refer CommonMethods class.
         */
    long l = al.stream().filter(i -> i <35).count();
        System.out.println("the number of failed students are  "+l);
}
}
