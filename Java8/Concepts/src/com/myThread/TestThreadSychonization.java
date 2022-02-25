package com.myThread;

class thread1 extends Thread{

    @Override
    public void run() {
        int sum=0;
        synchronized (this){
            for(int i=0; i<50 ; i++){
                sum += i;
            }
            notify();
        }
        System.out.println(sum);
    }
}

public class TestThreadSychonization{
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();
        synchronized(t1){
            try{
                System.out.println("Waiting for second thread to complete...");
                t1.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
//            System.out.println("Total is: " + t1.sum);
        }
    }
    }


