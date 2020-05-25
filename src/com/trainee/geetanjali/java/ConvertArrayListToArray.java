package com.trainee.geetanjali.java;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("hi");
        list.add("hello");
        list.add("world");
        list.add("1");
        list.add("2");
        list.add("3");
        Object[] objects = list.toArray();
        for (Object obj : objects) {
        System.out.print(obj + " ");}


    }
}
