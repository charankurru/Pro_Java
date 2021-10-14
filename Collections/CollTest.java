package java_progs.Collections;

import java.util.*;

public class CollTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add("roll num:" + Integer.toString(i));
        }
        sc.close();
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        // Adding elements at a specific position
        list.add(1, "roll num 1232");
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
