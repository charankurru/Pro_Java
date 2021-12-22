package java_progs.Collections.Map;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("Ravi");
        tset.add("Vijay");
        tset.add("Ajay");
        System.out.println(tset);
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Lowest value is " + set.pollFirst());
        System.out.println("Lowest Value: " + set.pollLast());
    }
}
