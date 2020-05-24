package com.trainee.aizaz.java;
import java.util.HashMap;

/**
 * Map.keySet() method returns a Set view of the keys contained
 * in this map and Map.values() method returns a collection-view
 * of the values contained in this map.
 * So If you need only keys or values from the map, you can iterate over
 * keySet or values using for-each loops. Below is the java program to demonstrate it.
 */
public class HashMapIterateMethod2 {
    public static void main(String[] args){
        HashMap<String,String> hp=new HashMap<String,String>();
        hp.put("one","hello");
        hp.put("two","hii");
        hp.put("three","Byee");
        hp.put("four","Byee");
        for(String s:hp.keySet()){
        String key=s;
        System.out.println("The key is "+key);
        }
        for(String s:hp.values()){
            String value=s;
            System.out.println("The value is "+value);
        }
    }
}