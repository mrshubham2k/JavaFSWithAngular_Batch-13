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

    public String getGrade()
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

    public StudentsDetail(int marks, String name) {
        super(marks);
        this.name = name;
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
                '}';
    }
}

//
//public class GradesCalculator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the score:");
//        int score = sc.nextInt();
//        CheckGrade obj1 = new CheckGrade(score);
//        obj1.check();
//    }
//}


public class CompanyHiring {




}
