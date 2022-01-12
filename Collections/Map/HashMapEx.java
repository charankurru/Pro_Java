package java_progs.Collections.Map;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "charan");
        map.put(2, "cherry");
        map.put(3, "prasad");
        map.put(4, "bharathi");
        map.put(5, "jai");

        // iterating the map elements using entryset which returns objects
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        map.put(5, "jaivardhan");
        map.remove(1);
        System.out.println(map.values());

        // iterating the map elements using keySet which returns the list of keys
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        if (!map.containsKey(1)) {
            System.out.println("one not present in the map");
        }

        // IMP methods
        /**
         * put(key,val) ==> used to insert (key,value) pairs into the map
         * get(key) ==> used to get the value of key
         * getOrDefault(key,default_value) ==> used to get value of key if not return
         * default_value
         * keySet() return set of keys.
         * values() returns collection of values
         * entrySet() return map object
         * remove(key) ==> used to remove (key,value) from the map
         * clear() ==> clear the Map
         * clone() ==> clones the Map
         * size() ==> return size of the Map
         * boolean containsKey(key) ==> checks whether key is present in the map or not
         * boolean contentsValue(value) ==> checks whether value is present in the or
         * Not
         *
         * 
         */

    }

}
