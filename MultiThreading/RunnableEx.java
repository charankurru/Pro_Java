package java_progs.MultiThreading;

class MySampleThreading1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class MySampleThreading2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class RunnableEx {
    public static void main(String[] args) {
        System.out.println("Hello World");
        MySampleThreading1 obj = new MySampleThreading1();
        MySampleThreading2 obj1 = new MySampleThreading2();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
    }
}
