package com.epam.practise.lesson0211;

public class ThreadDemo {
    public static void main(String[] args) {
//        CustomThread thread = new CustomThread();
//        thread.start();
//        thread.run();
       new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
//        String name = Thread.currentThread().getName();
//        System.out.println(name);

        Thread t1 = new Thread(new FiThread());
        t1.start();

    }
}
