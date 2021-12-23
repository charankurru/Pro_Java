package java_progs.DataStructures;

class Stack {
    static final int Max = 1000;
    int top;
    int arr[] = new int[Max];

    public Stack() {
        top = -1;
    }

    boolean isUnderflow() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return true;
        }
        return false;
    }

    boolean isOverflow() {
        if (top >= Max - 1) {
            System.out.println("Stack overflow");
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    void push(int element) {
        if (isOverflow())
            return;
        top++;
        arr[top] = element;
    }

    void pop() {
        if (isUnderflow())
            return;
        top--;
    }

    int peek() {
        if (isUnderflow())
            return -1;
        return arr[top];
    }

}

public class StackDs {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (stack.top >= 0) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
