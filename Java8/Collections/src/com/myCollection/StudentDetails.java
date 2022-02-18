package com.myCollection;

public class StudentDetails {

    private int id;
    private String name;
    private int cMarks;
    private int pMarks;
    private int mMarks;
    private String grade;

    public StudentDetails(){

    }

    public StudentDetails(int id, String name){
        this.id = id;
        this.name = name;
    }

    public StudentDetails(int id, String name, int cMarks, int mMarks, int pMarks){
        this.id = id;
        this.name= name;
        this.cMarks = cMarks;
        this.mMarks = mMarks;
        this.pMarks = pMarks;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCmarks(int cMarks){
        this.cMarks = cMarks;
    }

    public void setMmarks(int mMarks){
        this.mMarks = mMarks;
    }

    public void setpmarks(int pMarks){
        this.pMarks = pMarks;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getCmarks(){
        return this.cMarks;
    }

    public int getMmarks(){
        return this.mMarks;
    }

    public int getPmarks(){
        return this.pMarks;
    }

    public String getGrade(){
        return this.grade;
    }

    @Override
    public String toString(){
        return "StudentDetails  ["+
                "id: " + this.getId()+
                "name: " + this.getName()+ "  ]";
    }
}
