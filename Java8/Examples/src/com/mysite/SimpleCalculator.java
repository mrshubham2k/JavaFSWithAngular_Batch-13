package com.mysite;

import java.util.Scanner;

class Calculator{

    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int additionCalculator() {
        return (this.getNumber1()+this.getNumber2());
    }

    public int subtractionCalculator() {
        return (this.getNumber1()-this.getNumber2());
    }

    public int divisionCalculator(){
        return (this.getNumber1()/this.getNumber2());
    }

    public int multiplicationCalculator(){
        return (this.getNumber1()*this.getNumber2());
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}

public class SimpleCalculator {

    public static void handleToken(Calculator object1,int token) {
        if(token==1){
            System.out.println(object1.additionCalculator());
        }
        else if(token==2){
            System.out.println(object1.subtractionCalculator());
        }
        else if(token==3){
            System.out.println(object1.multiplicationCalculator());
        }
        else if(token==4){
            System.out.println(object1.divisionCalculator());
        }
        else{
            System.out.println("Wrong Choice!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        int tokenNo = sc.nextInt();
        Calculator calculate1 = new Calculator(number1,number2);
        handleToken(calculate1, tokenNo);
    }



}
