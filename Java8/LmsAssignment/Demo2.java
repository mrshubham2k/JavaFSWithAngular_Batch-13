package LmsAssignment;

import java.util.Scanner;

class Student{
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public Student() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getResult(){
        if(this.getMarks()>500)
            return "Student Result is : Pass";
        else
            return "Student Result is : Fail";
    }

    @Override
    public String toString() {
        return "Student Roll is : " + this.getRollNo() + "\nStudent Name is : " + this.getName()
                + "\nStudent Marks is : " + this.getMarks() + "\n" + this.getResult();
    }

}

public class Demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Details in roll:name:marks");
        String details = sc.nextLine();
        String[] detailsArr = details.split(":");
        Student std=new Student(Integer.parseInt(detailsArr[0]),detailsArr[1],Integer.parseInt(detailsArr[2]));

        System.out.println(std);
    }


}
