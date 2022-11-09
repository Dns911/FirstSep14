package com.epam.practise.lesson0211;

public class FiThread implements Runnable {
    @Override
    public void run() {
        new Thread(()-> System.out.println(Thread.currentThread().getName())).start();


    }
}
