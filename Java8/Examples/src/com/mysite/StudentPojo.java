package com.mysite;

class StudentDetails{
    private int id;
    private String name;
    private int cmarks;
    private int pmarks;
    private int mmarks;

    public StudentDetails(int id, String name, int cmarks, int pmarks, int mmarks) {
        this.id = id;
        this.name = name;
        this.cmarks = cmarks;
        this.pmarks = pmarks;
        this.mmarks = mmarks;
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

    public int getCmarks() {
        return this.cmarks;
    }

    public void setCmarks(int cmarks) {
        this.cmarks = cmarks;
    }

    public int getPmarks() {
        return this.pmarks;
    }

    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }

    public int getMmarks() {
        return this.mmarks;
    }

    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cmarks=" + cmarks +
                ", pmarks=" + pmarks +
                ", mmarks=" + mmarks +
                '}';
    }
}

public class StudentPojo {

    public static StudentDetails checkMaximumScore(StudentDetails[] student){
        int percentage, maximumPercentage=0,index=0;
        int[] percentageArray = new int[4];
        for(int i=0;i<4;i++){
            percentage = (student[i].getCmarks()+student[i].getPmarks()+student[i].getMmarks())/3;
            percentageArray[i] = percentage;
            maximumPercentage = Math.max(maximumPercentage,percentage);
        }

        System.out.println("The student with maximum % is:");

        System.out.println("Percentage:"+ maximumPercentage);
        for(int i=0;i<4;i++)
        {
            if(maximumPercentage==percentageArray[i]){
                index = i;
                break;

            }
        }
        return student[index];
    }

    public static void main(String[] args) {
        StudentDetails[] student = new StudentDetails[4];
        student[0] = new StudentDetails(101,"Raj",45,55,67);
        student[1] = new StudentDetails(102,"Rajesh",65,85,77);
        student[2] = new StudentDetails(103,"Suraj",43,55,60);
        student[3] = new StudentDetails(104,"Tom",71,65,70);
        StudentDetails newStudentobject = checkMaximumScore(student);
        System.out.println(newStudentobject);


    }


}
