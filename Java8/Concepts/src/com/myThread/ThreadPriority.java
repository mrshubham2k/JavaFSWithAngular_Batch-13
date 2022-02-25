package com.myThread;
/*
Priority of a Thread

public final int getPriority(): The java.lang.Thread.getPriority() method returns the priority of the given thread.

public final void setPriority(int newPriority): minimum-1 and maximum-10

3-constant deifned
i)public static int MIN_PRIORITY
ii)public static int NORM_PRIORITY
iii)public static int MAX_PRIORITY

Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.

 */

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class ThreadPriority  {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        Thread t4 = new Thread();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(6);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Priority of t1 ie Minimum "+t1.getPriority());
        System.out.println("Priority of t2 ie defined "+t2.getPriority());
        System.out.println("Priority of t3 ie Maximum "+t3.getPriority());
        System.out.println("Priority of t3 ie default "+t4.getPriority());

        System.out.println("After setting the priority of main method");
        Thread.currentThread().setPriority(7);//Priority of main is now 7
        System.out.println("Priority of main Thread "+ Thread.currentThread().getPriority());
        Thread th1 = new Thread();
        System.out.println("Priority of new Thread will be same as the main thread if we don't change it " + th1.getPriority());
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();


    }
}
