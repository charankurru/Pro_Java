package java_progs.MultiThreading;

class CustomThread extends Thread {
    private String greet;

    CustomThread(String name) {
        this.greet = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++)
            try {
                Thread.sleep(5000);
                System.out.println(this.greet + " " + i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("hello");
        t1.start();
        CustomThread t2 = new CustomThread("hi");
        t2.start();

    }
}
