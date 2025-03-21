package com.multithreading;

public class Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment() {
        synchronized (this) {
            count++;
        }
    }
}
