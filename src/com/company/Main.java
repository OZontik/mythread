package com.company;

import java.lang.ThreadGroup;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable r  = new MyThread();
        ThreadGroup mainGroup = new ThreadGroup("main group");
        Thread myThread1 = new Thread(mainGroup, r, "1");
        Thread myThread2 = new Thread(mainGroup, r, "2");
        Thread myThread3 = new Thread(mainGroup, r, "3");
        Thread myThread4 = new Thread(mainGroup, r, "4");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException err) {
            System.out.println(err.getMessage());
        }
        mainGroup.interrupt();
    }
}