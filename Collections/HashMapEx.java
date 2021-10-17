package java_progs.Collections;

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

    }

}
