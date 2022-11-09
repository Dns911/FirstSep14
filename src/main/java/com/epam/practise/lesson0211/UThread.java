package com.epam.practise.lesson0211;

import java.util.concurrent.TimeUnit;

public class UThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<7; i++){
            System.out.println("Thread" + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
