package java_progs.Collections.Set;

import java.util.*;

public class HashSetEx {

    public static void Display(HashSet<String> lst) {
        for (String s : lst) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Charan");
        set.add("Charan");
        Display(set);
        // To remove a specific element from the set
        set.remove("One");
        set.remove("Two");
        Display(set);
        // To remove all elements from the set
        set.removeAll(set);
        Display(set);
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(20);
        set1.add(1);
        set1.add(22);
        set1.add(999);
        set1.add(-1);
        set1.add(2);
        set1.add(3);
        set1.add(7);
        set1.add(4);
        System.out.println(set1);
        Integer obj = new Integer(12);
        Integer obj2 = new Integer(12);
        System.out.println(obj2.hashCode());
        System.out.println(obj.hashCode());

    }
}
