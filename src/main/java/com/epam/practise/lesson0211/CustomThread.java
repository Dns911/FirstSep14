package com.epam.practise.lesson0211;

public class CustomThread extends Thread {
    @Override
    public void run() {
        this.setName("custom_thread");
        System.out.println(Thread.currentThread().getName());
    }
}
