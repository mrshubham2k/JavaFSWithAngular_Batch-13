import java.util.ArrayList;

class StudentDetail1{
    private int id,cMarks,Pmarks,Mmarks;
    private String name;
    private String grade;

    public StudentDetail1(int id, String name, int cMarks, int pmarks, int mmarks) {
        this.id = id;
        this.name = name;
        this.cMarks = cMarks;
        this.Pmarks = pmarks;
        this.Mmarks = mmarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getcMarks() {
        return cMarks;
    }

    public void setcMarks(int cMarks) {
        this.cMarks = cMarks;
    }

    public int getPmarks() {
        return Pmarks;
    }

    public void setPmarks(int pmarks) {
        Pmarks = pmarks;
    }

    public int getMmarks() {
        return Mmarks;
    }

    public void setMmarks(int mmarks) {
        Mmarks = mmarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        int total = (this.getcMarks()+this.getMmarks()+this.getPmarks())/3;
        if(total<=100 && total>90){
            this.grade="A";
        }
        else if(total<=90 && total>80){
            this.grade="B";
        }
        else if(total<=80 && total>70){
            this.grade="C";
        }
        else{
            this.grade="Average";
        }
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade="+ grade;
    }
}

interface HireCriteria{
    public ArrayList<Integer> requiredCriteria(ArrayList<StudentDetail1> student);
}

class Amazon implements HireCriteria{

    @Override
    public ArrayList<Integer> requiredCriteria(ArrayList<StudentDetail1> student) {
        ArrayList<Integer> hiredStudent = new ArrayList<>();
        for(StudentDetail1 std:student){
            if((std.getGrade()=="B"|| std.getGrade().compareTo("B")>0) && std.getMmarks()>80) {
                hiredStudent.add(std.getId());
            }
        }
        return hiredStudent;
    }
}

class Delloite implements HireCriteria{

    @Override
    public ArrayList<Integer> requiredCriteria(ArrayList<StudentDetail1> student) {
        ArrayList<Integer> hiredStudent = new ArrayList<>();
        for(StudentDetail1 std:student){
            if((std.getGrade()=="B"|| std.getGrade().compareTo("B")>0) && std.getMmarks()>70) {
                hiredStudent.add(std.getId());
            }
        }
        return hiredStudent;
    }
}


public class HiredByCompany{

    public static void main(String[] args) {
        ArrayList<StudentDetail1> student = new ArrayList<>();
        student.add(new StudentDetail1(101,"Raj",95,91,87));
        student.add(new StudentDetail1(102,"Rajesh",65,85,77));
        student.add(new StudentDetail1(103,"Suraj",73,75,70));
        student.add(new StudentDetail1(104,"Tom",71,75,70));
        student.add(new StudentDetail1(105,"Dhruv",84,76,95));
        student.add(new StudentDetail1(106,"Ankush",85,82,75));

        for(StudentDetail1 std:student){
            std.setGrade();
        }
        Amazon amazonObj = new Amazon();
        ArrayList<Integer> hiredByAmazon = amazonObj.requiredCriteria(student);

        Delloite delloiteObj = new Delloite();
        ArrayList<Integer> hiredByDelloite = delloiteObj.requiredCriteria(student);

        for(StudentDetail1 std:student){
            String selected="";
            if(hiredByAmazon.contains(std.getId())){
                selected = std.getName()+" is selected by amazon";
            }
            if(hiredByDelloite.contains(std.getId())){
                if(selected==""){
                    selected = std.getName()+" is selected by delloite";
                }
                else{
                selected = selected+",delloite";
                }
            }
            System.out.println(selected);
        }

    }





}
