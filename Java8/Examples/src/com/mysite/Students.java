package com.mysite;

import java.util.Arrays;
import java.util.Scanner;

class DetailsOfStudents implements Comparable<DetailsOfStudents>{
    private int id;
    private String name;

    public DetailsOfStudents(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DetailsOfStudents{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(DetailsOfStudents o) {
        return this.getId()-o.getId();
    }
}

public class Students {

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


//        stdArray[0] = new DetailsOfStudents(101,"Raj");
//        stdArray[1] = new DetailsOfStudents(121,"Rajesh");
//        stdArray[2] = new DetailsOfStudents(130,"Suraj");
//        stdArray[3] = new DetailsOfStudents(114,"Tom");

        System.out.println("Sorting by Id");
        Arrays.sort(stdArray);
        for(int i=0;i<noOfEntry;i++)
        {
            System.out.println(stdArray[i]);
        }

        System.out.println("___________________________________________________________________________________________________________________________________________________");

        System.out.println("Sorting by Name");
        Arrays.sort(stdArray, (a, b) -> a.getName().compareTo(b.getName()));
        for(int i=0;i<noOfEntry;i++)
        {
            System.out.println(stdArray[i]);
        }

    }

}



        101 Raj
        121 Rajesh
        130 Suraj
        114 Tom