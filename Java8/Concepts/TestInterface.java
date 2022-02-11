package com.mysite;


interface MyInterface{
    //    void printme();
    default void printme(){
        System.out.println("From myInterface");
    }

    void printyou();
}

interface MyInterface2{
    default void printme(){
        System.out.println("From myInterface2");
    }

    void printyou();
}

class InterfaceImpl implements MyInterface,MyInterface2{

    @Override
    public void printme() {
        MyInterface2.super.printme();
        System.out.println("Completed printing MyInterface2");
        MyInterface.super.printme();
        System.out.println("Completed printing MyInterface1");
    }

    @Override
    public void printyou() {
        System.out.println("From Class");
    }
}

public class TestInterface {

    public static void main(String[] args) {
        InterfaceImpl obj = new InterfaceImpl();
        obj.printme();
        obj.printyou();
    }
}
