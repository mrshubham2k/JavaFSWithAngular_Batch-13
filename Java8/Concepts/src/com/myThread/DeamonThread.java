package com.myThread;

/*
Daemon thread in Java is a service provider thread that provides services to the user thread.
Its life depend on the mercy of user threads i.e. when all the user threads dies,
JVM terminates this thread automatically.

Daemon Thread in Java
1-It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
2-Its life depends on user threads.
3-It is a low priority thread.

Methods in daemonThread
1)	public void setDaemon(boolean status)	is used to mark the current thread as daemon thread or user thread.
2)	public boolean isDaemon()	is used to check that current is daemon.

 */


public class DeamonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){//checking for daemon thread
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args){
        DeamonThread t1=new DeamonThread();//creating thread
        DeamonThread t2=new DeamonThread();
        DeamonThread t3=new DeamonThread();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();//starting threads
        t2.start();
        t3.start();
    }
}