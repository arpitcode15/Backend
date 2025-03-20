package com.multithreading;

public class SynchronisedDemo {

    public static void main(String[] args) {
       /*
       Approach - 1
       Counter counter = new Counter();
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);
        t1.start();
        t2.start();

        */

        //Approach - 2
        // No extra class required (MyThread.java)
        Counter counter = new Counter(); // Shared counter object

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }

}
