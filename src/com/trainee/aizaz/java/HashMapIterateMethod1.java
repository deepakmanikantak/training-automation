package com.trainee.aizaz.java;
import java.util.HashMap;
import java.util.Map;

/**
 * Map.entrySet() method returns a collection-view(Set<Map.Entry<K, V>>)
 * of the mappings contained in this map. So we can iterate over key-value pair
 * using getKey() and getValue() methods of Map.Entry<K, V>.
 * This method is most common and should be used if you need both map keys and values in the loop.
 * Below is the java program to demonstrate it.
 */
public class HashMapIterateMethod1 {
    public static void main(String[] args){
        HashMap<String,String>hp=new HashMap<String,String>();
        hp.put("one","hello");
        hp.put("two","hii");
        hp.put("three","Byee");
        hp.put("four","Byee");
        for(Map.Entry<String,String> me:hp.entrySet()){
            String key=(String)me.getKey();
            String value=(String)me.getValue();
            System.out.println("the key is "+key);
            System.out.println("the value is "+value);
        }
    }
}