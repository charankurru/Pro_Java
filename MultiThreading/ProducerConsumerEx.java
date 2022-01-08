package java_progs.MultiThreading;

class Resource {
    int num = 0;
    boolean valueset = false;

    public synchronized void setNum() {
        // num++;
        // System.out.println("Producing " + this.num);
        if (this.valueset) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.num = num + 1;
        System.out.println("Producing " + this.num);
        valueset = true;
        notify();
    }

    public synchronized void getNum() {
        if (!this.valueset) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("consuming" + this.num);
        this.valueset = false;
        notify();
    }
}

class Consumer extends Thread {
    public Resource r1;

    public Consumer(Resource obj) {
        this.r1 = obj;
    }

    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (Exception e) {
            }
            this.r1.getNum();
        }
    }

}

class Producer extends Thread {
    Resource r1;

    Producer(Resource obj) {
        this.r1 = obj;
    }

    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (Exception e) {
            }
            this.r1.setNum();
        }
    }

}

public class ProducerConsumerEx {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Producer pd = new Producer(r1);
        Consumer c = new Consumer(r1);
        pd.start();
        c.start();
    }
}
