package java_progs.Collections.Stack;

import java.util.*;

public class StackEx {

    /**
     * push() ==>used to push element into stack
     * pop() ==>used to pop element from stack
     * empty() ==> returns a boolean value whether stak is empty or not
     * peek() ==> returns top element of stack
     * search ==> this methods searches for a element and returns the position
     */

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
