package java_progs.DataStructures;

class Node {
    int data;
    Node next;

    Node(int ele) {
        this.data = ele;
        next = null;
    }
}

class LinkedListEx {
    Node head;

    LinkedListEx(Node start) {
        this.head = start;
    }

    void addFront(Node node) {
        node.next = head;
        head = node;
    }

    void addLast(Node node) {
        Node ptr = this.head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = node;
    }

    void display() {
        Node ptr = this.head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;

        }
    }

}

public class LinkedListDs {
    public static void main(String[] args) throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        LinkedListEx lst = new LinkedListEx(node1);
        lst.addFront(node2);
        lst.addFront(node3);
        lst.addLast(node4);
        lst.addLast(node5);
        lst.display();

    }
}
