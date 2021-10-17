package java_progs.Collections;

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

    }
}
