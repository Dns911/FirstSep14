package com.epam.practise.lesson0211;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitVDemo {
    public static void main(String[] args) {
        UThread uThread = new UThread();
        uThread.start();
        Thread tr = new Thread(new FiThread());
        tr.start();
        System.out.println("more...");
//        CallThread callThread = new CallThread();
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> result= service.submit(new CallThread());
        try {
            String str = result.get();
            System.out.println(str);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end");
        service.shutdownNow();

    }
}
