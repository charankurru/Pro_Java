package java_progs.Collections;

import java.util.*;

class ArrayListEx {

    public static void Display(ArrayList<String> lst) {
        // for (String s : lst) {
        // System.out.print(s + " ");
        // }
        // System.out.println();
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add("roll num:" + Integer.toString(i));
        }
        sc.close();
        Display(list);
        // Adding elements at a specific position
        list.add(1, "roll num 1232");
        // removing elements at a specific position
        list.remove(1);
        // removing specific element.
        list.remove("roll num:0");

        Display(list);
    }
}
