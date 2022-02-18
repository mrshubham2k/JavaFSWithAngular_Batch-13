import java.lang.reflect.Array;
import java.util.ArrayList;

class StudentDetails{
    private int rollNo, cMarks, mmarks, pmarks;
    private String fName, lName;

    public StudentDetails(int rollNo, String fName, String lName, int cMarks, int mmarks, int pmarks) {
        this.rollNo = rollNo;
        this.cMarks = cMarks;
        this.mmarks = mmarks;
        this.pmarks = pmarks;
        this.fName = fName;
        this.lName = lName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getcMarks() {
        return cMarks;
    }

    public void setcMarks(int cMarks) {
        this.cMarks = cMarks;
    }

    public int getMmarks() {
        return mmarks;
    }

    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }

    public int getPmarks() {
        return pmarks;
    }

    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return  "RollNo = " + rollNo  +"\n"+
                "First-Name = " + fName   +"\n"+
                "Last-Name = " + lName  ;
    }
}

class FindMaximumPercentage{
    public ArrayList<Integer> getAverage(ArrayList<StudentDetails> student){
        ArrayList<Integer> average = new ArrayList<>();
        for(StudentDetails std: student){
            average.add((std.getcMarks()+std.getMmarks()+std.getPmarks())/3);
        }
        return average;
    }

    public StudentDetails findMaximum(ArrayList<StudentDetails> student){
        ArrayList<Integer> average = getAverage(student);
        int maxPercentage=0,index;
        for(Integer avg:average){
            maxPercentage = Math.max(avg,maxPercentage);
        }
        index = average.indexOf(maxPercentage);
//        Only for printing purpose
        System.out.print("The student with maximum percentage is: ");
        System.out.println(maxPercentage);
        return student.get(index);
    }
}

public class TestArrayList {

    public static void main(String[] args) {
        /*
        Finding maximum percentage student!
        ArrayList<StudentDetails> student = new ArrayList<>();
        student.add(new StudentDetails(101,"Raj","Sharma",45,55,67));
        student.add(new StudentDetails(102,"Rajesh","Mishra",65,85,77));
        student.add(new StudentDetails(103,"Suraj","Verma",43,55,60));
        student.add(new StudentDetails(104,"Tom","Oli",71,65,70));

        FindMaximumPercentage maximum = new FindMaximumPercentage();
        System.out.println(maximum.findMaximum(student));
        */

        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(10);
        test1.add(50);
        test1.add(30);
        test1.add(95);
        test1.add(5);

        ArrayList<Integer> test2 = new ArrayList<>();
//  addAll will add all the elements from one ArrayList to another.
//  This is adding all the elements of test1 to test2 AL.
        test2.addAll(test1);
        System.out.println(test2);

//        here we are removing all the elements of test2 ArrayList
        test2.removeAll(test2);
        System.out.println(test2);

//  contains is used to check whether the element in present in the arraylist or not (it will return either true or false)

        System.out.println(test1.contains(5));
        System.out.println(test1.contains(1));

//  indexof will return the index of particular element

        System.out.println(test1.indexOf(30));
        System.out.println(test1.indexOf(95));

    }


}
