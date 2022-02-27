//
//
//import java.util.ArrayList;
//
//class StudentDetails{
//    private int id;
//    private String name;
//    private int cmarks;
//    private int pmarks;
//    private int mmarks;
//
//    public StudentDetails(int id, String name, int cmarks, int pmarks, int mmarks) {
//        this.id = id;
//        this.name = name;
//        this.cmarks = cmarks;
//        this.pmarks = pmarks;
//        this.mmarks = mmarks;
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getCmarks() {
//        return this.cmarks;
//    }
//
//    public void setCmarks(int cmarks) {
//        this.cmarks = cmarks;
//    }
//
//    public int getPmarks() {
//        return this.pmarks;
//    }
//
//    public void setPmarks(int pmarks) {
//        this.pmarks = pmarks;
//    }
//
//    public int getMmarks() {
//        return this.mmarks;
//    }
//
//    public void setMmarks(int mmarks) {
//        this.mmarks = mmarks;
//    }
//
//    @Override
//    public String toString() {
//        return "StudentDetails{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", cmarks=" + cmarks +
//                ", pmarks=" + pmarks +
//                ", mmarks=" + mmarks +
//                '}';
//    }
//}
//public class GradeCalculator {
//
//    public static StudentDetails checkMaximumScore(ArrayList<StudentDetails> student){
//        int percentage, maximumPercentage=0,index=0;
//        ArrayList<Integer> studentPercentage = new ArrayList<>();
//        for(StudentDetails std:student){
//            percentage = (std.getCmarks()+std.getPmarks()+std.getMmarks())/3;
//            studentPercentage.add(percentage) ;
//            maximumPercentage = Math.max(maximumPercentage,percentage);
//        }
//
//        System.out.println("The student with maximum % is:");
//
//        System.out.println("Percentage:"+ maximumPercentage);
//        index=studentPercentage.indexOf(maximumPercentage);
//        return student.get(index);
//    }
//
//    public static void main(String[] args) {
//        ArrayList<StudentDetails> student = new ArrayList<StudentDetails>();
//        student.add(new StudentDetails(101,"Raj",45,55,67));
//        student.add(new StudentDetails(102,"Rajesh",65,85,77));
//        student.add(new StudentDetails(103,"Suraj",43,55,60));
//        student.add(new StudentDetails(104,"Tom",71,65,70));
//        System.out.println(checkMaximumScore(student));
//
//
//    }
//}
