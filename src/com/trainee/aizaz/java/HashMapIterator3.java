package com.trainee.aizaz.java;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 * This method is somewhat similar to first one. In first method we use
 * for-each loop over Map.Entry<K, V>, but here we use iterators. Using iterators
 * over Map.Entry<K, V> has it’s own advantage,i.e. we can remove entries
 * from the map during iteration by calling iterator.remove() method
 */

public class HashMapIterator3 {
    public static void main(String[]values) {
        HashMap<String, String> hp = new HashMap<String, String>();
        hp.put("one", "hello");
        hp.put("two", "hii");
        hp.put("three", "Byee");
        hp.put("four", "Byee");
        Iterator<Map.Entry<String,String>> itr=hp.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,String>me=itr.next();
            String key=me.getKey();
            String value=me.getValue();
            System.out.println("key is : "+key);
            System.out.println("value is : "+value);
        }
    }
}