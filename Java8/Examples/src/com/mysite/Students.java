package com.mysite;

import java.util.*;
import java.util.Scanner;

class DetailsOfStudents {
    private int id;
    private String name;

    public DetailsOfStudents(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DetailsOfStudents{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}

public class Students {

//    public static DetailsOfStudents[] SortById(DetailsOfStudents[] studentArray){
//        System.out.println("Sorting by Id");
//        Arrays.sort(studentArray);
//        for(int i=0;i< studentArray.length;i++)
//        {
//            System.out.println(studentArray[i]);
//        }
//        return studentArray;
//    }
//
//    public static DetailsOfStudents[] SortByName(DetailsOfStudents[] studentArray){
//        System.out.println("Sorting by Name");
//        Arrays.sort(studentArray, (a, b) -> a.getName().compareTo(b.getName()));
//        for(int i=0;i<studentArray.length;i++)
//        {
//            System.out.println(studentArray[i]);
//        }
//        return studentArray;
//    }

    public static DetailsOfStudents[] sortDetails(DetailsOfStudents[] studentArray,int id){
        DetailsOfStudents swap;
        for(int i=0;i<studentArray.length;i++)
        {
            for(int j=i;j<studentArray.length-1;j++){
                if(studentArray[j].getId()>studentArray[j+1].getId()){

                    swap = studentArray[j];
                    studentArray[j] = studentArray[j+1];
                    studentArray[j+1] = swap;

//
                }
            }
        }
        return studentArray;
    }

    public static DetailsOfStudents[] sortDetails(DetailsOfStudents[] studentArray,String name){
        DetailsOfStudents swap;
        for(int i=0;i<studentArray.length;i++)
        {
            for(int j=i;j<studentArray.length-1;j++){
                String name1 = studentArray[j+1].getName();
                String name2 = studentArray[j].getName();
                if(name1.compareToIgnoreCase(name2)<0){
                    swap = studentArray[j];
                    studentArray[j] = studentArray[j+1];
                    studentArray[j+1] = swap;
                }
            }
        }
        return studentArray;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries");
        int noOfEntry = sc.nextInt();
        DetailsOfStudents[] stdArray = new DetailsOfStudents[noOfEntry];
        System.out.println("Enter the vales first Id then Name");
        for(int i=0;i<noOfEntry;i++)
        {
            int id= sc.nextInt();
            String name = sc.nextLine();
            stdArray[i] = new DetailsOfStudents(id, name);
        }
        DetailsOfStudents[] idSortedArray = sortDetails(stdArray,1);
        for(int i=0;i<idSortedArray.length;i++)
        {
            System.out.println(idSortedArray[i]);
        }
        System.out.println("___________________________________________________________________________________________________________________________________________________");
        idSortedArray = sortDetails(idSortedArray,"name");
        for(int i=0;i<idSortedArray.length;i++)
        {
            System.out.println(idSortedArray[i]);
        }

    }

}
