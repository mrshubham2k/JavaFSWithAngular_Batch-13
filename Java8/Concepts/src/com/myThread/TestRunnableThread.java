package com.myThread;

public class TestRunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Hi from run method");
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        TestRunnableThread t1 = new TestRunnableThread();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t1);
        System.out.println(Thread.currentThread());
        th1.start();
        th2.start();
    }
}
