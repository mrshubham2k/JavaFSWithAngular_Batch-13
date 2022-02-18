class GetGrades{
    private int marks;

    GetGrades(int marks){
        this.marks = marks;
    }

    public int getMarks() {
        return this.marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrades()
    {
        if(marks<=100 && marks>90)
            return "A";

        else if(marks<=90 && marks>80)
            return "B";

        else if(marks<=80 && marks>70)
            return "C";

        else
            return "Average";
    }
}

class StudentsDetail extends GetGrades{
        private String name;
        private String grade;

    public StudentsDetail(int marks, String name) {
        super(marks);
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentsDetail{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

interface PlacementDept{
    StudentsDetail[] getHiredStudent(StudentsDetail[] students);
}

class Google implements PlacementDept{

    @Override
    public StudentsDetail[] getHiredStudent(StudentsDetail[] students) {
        StudentsDetail[] googlePlaced = new StudentsDetail[students.length];
        for(int i=0;i<googlePlaced.length;i++) {
            if((students[i].getGrade()=="B" || students[i].getGrade()=="A") && students[i].getMarks()>80){
                googlePlaced[i] = students[i];
            }
        }
        return googlePlaced;
    }

}

class Facebook implements PlacementDept{

    @Override
    public StudentsDetail[] getHiredStudent(StudentsDetail[] students) {
        return null;
    }
}



public class CompanyHiring {
    public static void main(String[] args) {
        StudentsDetail[] students = new StudentsDetail[4];
        students[0] = new StudentsDetail(82,"Raj");
        students[1] = new StudentsDetail(86,"Rajesh");
        students[2] = new StudentsDetail(91,"Suraj");
        students[3] = new StudentsDetail(66,"Tom");


        for(int i=0;i<4;i++){
            students[i].setGrade(students[i].getGrades());
//            System.out.println(students[i]);
        }

        Google hrGoogle = new Google();
        StudentsDetail[] hiredByGoogle = hrGoogle.getHiredStudent(students);

        for(int i=0;i<4;i++){
            if(hiredByGoogle[i]!=null){
                System.out.println(hiredByGoogle[i]);
            }
        }

        StudentsDetail students1 = new StudentsDetail(82,"Shubham");
        students1.getMarks();
    }

}
