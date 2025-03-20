package com.multithreading;

/*   Thread LifeCycle
      1.  New State:
      2.  Runnable State
      3.  Blocked/Waiting State
      4.  Terminated State
  */

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("Arpit");
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getState()); // NEW
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE
        Thread.sleep(100);
        System.out.println(t1.getState()); // TIMED WAITING

        //Main method will wait for t1 to be executed and finish.
        t1.join();
        System.out.println(t1.getState()); // TERMINATED

    }

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
