package java_progs.MultiThreading;

class MySampleThreadingC1 extends Thread {
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

class MySampleThreadingC2 extends Thread {
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

public class ThreadClassEx {
    public static void main(String[] args) {
        System.out.println("Hello World");
        MySampleThreadingC1 obj = new MySampleThreadingC1();
        MySampleThreadingC2 obj1 = new MySampleThreadingC2();
        obj.start();
        obj1.start();
    }
}
