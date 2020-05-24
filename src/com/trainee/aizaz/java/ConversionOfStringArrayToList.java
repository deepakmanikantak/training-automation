package com.trainee.aizaz.java;
import java.util.*;

public class ConversionOfStringArrayToList {
    public static void main(String[]args){
        String[] str={"hello","hii","bye"};
        //method--1
        List<String>list=Arrays.asList(str);
        list.set(0,"hey");
        System.out.println(list);
        //method-2
        ArrayList<String> al=new ArrayList<String>();
        Collections.addAll(al,str);
        System.out.println(al);
        //method--3
        ArrayList<String> al2 = new ArrayList<String>();
        for (String s : str) {
            al2.add(s);
        }
        System.out.println(list);


    }
}