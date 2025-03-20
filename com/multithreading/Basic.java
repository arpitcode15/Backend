package com.multithreading;

/*
Use Thread when:
1. You don’t need to extend any other class – Since Java does not support multiple inheritance, extending Thread means you cannot extend any other class.
2. You want to directly override the run() method – The class itself represents a thread.
3. You need more control over the thread, such as directly calling start() on a Thread object.

Use Runnable when:
1. You need better flexibility – Since Runnable is an interface, the class implementing it can extend another class if needed.
2. You want to share the same runnable instance among multiple threads – Runnable allows code reusability.
3. You want to separate the task from the execution – Runnable allows decoupling the task (business logic) from the thread.
 */
public class Basic {

    public static void main(String[] args) {

        World world = new World(); // NEW
        Thread t1 = new Thread(world);
        t1.start(); // RUNNABLE STATE
        for (; ; )
            System.out.println("Hello");


    }


}
