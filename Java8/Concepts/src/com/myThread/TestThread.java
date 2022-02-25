package com.myThread;

public class TestThread extends Thread{
/*

Constructors of Thread

Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r,String name)



Concurrency problem

Because threads run at the same time as other parts of the program,
there is no way to know in which order the code will run.
When the threads and main program are reading and writing the same variables, the values are unpredictable.
The problems that result from this are called concurrency problems.

Use isAlive() to prevent concurrency problems:

while(thread.isAlive()) {
    System.out.println("Waiting...");
  }

 */

    public void run()
    { int ctr=0;
//        System.out.println(Thread.currentThread());
        for(int i=1;i<=3;i++)
            System.out.println(ctr++);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread());

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestThread mt1=new TestThread();
        Thread t1=new Thread(mt1);
        Thread t2=new Thread(mt1);
        t1.setName("thread1");
        t1.setPriority(8);
        t1.start();
        t2.setName("thread2");
        t2.start();

        System.out.println(t1.getName());
        System.out.println(Thread.currentThread());//Thread[thread1,8,main] & Thread[thread2,5,main]


    }

}
