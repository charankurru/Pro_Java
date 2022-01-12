package java_progs.DataStructures;

class Nod {
    int data;
    Nod next;

    Nod(int ele) {
        this.data = ele;
        next = null;
    }
}

class LinkedListEx {
    Nod head;

    LinkedListEx(Nod start) {
        this.head = start;
    }

    void addFront(Nod Nod) {
        Nod.next = head;
        head = Nod;
    }

    void addLast(Nod Nod) {
        Nod ptr = this.head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = Nod;
    }

    void display() {
        Nod ptr = this.head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;

        }
    }

}

public class LinkedListDs {
    public static void main(String[] args) throws Exception {
        Nod Nod1 = new Nod(1);
        Nod Nod2 = new Nod(2);
        Nod Nod3 = new Nod(3);
        Nod Nod4 = new Nod(4);
        Nod Nod5 = new Nod(5);
        LinkedListEx lst = new LinkedListEx(Nod1);
        lst.addFront(Nod2);
        lst.addFront(Nod3);
        lst.addLast(Nod4);
        lst.addLast(Nod5);
        lst.display();

    }
}
