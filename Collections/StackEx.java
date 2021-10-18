package java_progs.Collections;

import java.util.*;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            st.push(i);
        }
        while (st.size() > 0) {
            System.out.print(st.pop() + " ");
        }
    }
}
