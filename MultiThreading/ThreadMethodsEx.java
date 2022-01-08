package java_progs.MultiThreading;

import java.util.*;

//main Thread methods example
public class ThreadMethodsEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inside :: Main Method");
        System.out.println("Thread name is" + " " + Thread.currentThread().getName());
        System.out.println("Thead Priority is " + " " + Thread.currentThread().getPriority());
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            Thread.currentThread().setName(str);
        } catch (Exception e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
        Thread.currentThread().wait();
        System.out.println("Thread name is" + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + "  is alive  " + Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().getName() + "  is Daemon  " + Thread.currentThread().isDaemon());
        // StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        // for (StackTraceElement st : stackTrace) {
        // System.out.println(st);
        // }
        System.out.println();
        System.out.println("Thread Name  Thread Priority Thread Group");
        System.out.println(Thread.currentThread().toString());
    }
}
