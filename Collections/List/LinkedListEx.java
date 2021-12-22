package java_progs.Collections.List;

import java.util.*;

class LinkedListEx {
    public static void display(LinkedList<String> lst) {
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");

        // adding elements at specific position
        ll.add(0, "charan");
        ll.add(4, "bujji");

        display(ll);

        // Adding a new list to existing list

        LinkedList<String> ll1 = new LinkedList<String>();
        ll.add("cola");
        ll.add("limca");
        ll.add("pepsi");
        ll.addAll(ll1);

        display(ll);

        // Adding a new list at a specific position to exixting list

        LinkedList<String> ll3 = new LinkedList<String>();
        ll3.add("bear");
        ll3.add("Lion");

        ll.addAll(0, ll3);

        display(ll);

    }

}
