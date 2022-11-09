package com.epam.practise.lesson0211;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallThread implements Callable<String> {
    @Override
    public String call(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<7; i++){
            builder.append("Call" + i);
            System.out.println("thhhh" + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return builder.toString();
    }
}
