package java_progs.DataStructures;

class Queue {
    final static int Max = 1000;
    int front;
    int rear;
    int queue[] = new int[Max];

    Queue() {
        front = -1;
        rear = -1;
    }

    void push(int element) {
        if (rear >= Max - 1) {
            System.out.println("Queue is Filled");
            return;
        }
        if (front == -1)
            front++;
        rear++;
        queue[rear] = element;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("queue is Empty");
            return;
        }
        front++;
    }

    int peek() {
        if (!isEmpty())
            return queue[front];
        return -1;
    }

    boolean isEmpty() {
        return (front > rear || front == -1 && rear == -1);
    }

}

public class QueueDs {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}
