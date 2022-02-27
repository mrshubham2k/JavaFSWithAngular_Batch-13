//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Scanner;
//
//class Employee1 implements Comparable<Employee1>{
//    private int id;
//    private String name;
//    private String department;
//    private Date dateOfJoining;
//    private int age;
//    private int salary;
//
//    public Employee1() {
//    }
//
//    public Employee1(int id, String name, String department, Date dateOfJoining, int age, int salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.dateOfJoining = dateOfJoining;
//        this.age = age;
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public Date getDateOfJoining() {
//        return dateOfJoining;
//    }
//
//    public void setDateOfJoining(Date dateOfJoining) {
//        this.dateOfJoining = dateOfJoining;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public int compareTo(Employee1 o){
//        return this.getSalary()-o.getSalary();
//    }
//
//    @Override
//    public String toString() {
//        return "%-15s %-30s %-30s %-10s %-10s\n";
//    }
//}
//
//class AgeComparator extends Employee1 implements Comparable<Employee1>{
//
//    @Override
//    public int compareTo(Employee1 o) {
//        if(this.getAge()==o.getAge()){
//            return this.getDateOfJoining().compareTo(o.getDateOfJoining());
//        }
//        else{
//            return this.getAge()-o.getAge();
//        }
//    }
//}
//
//class EmployeeBO extends Employee1 {
//    public static void printEmployees(Employee1 e){
//        System.out.println("[ ID: "+e.getId()+" Name: "+e.getName()+" Age: "+e.getAge()+
//                " Department: "+e.getDepartment()+" Salary: "+ e.getSalary()+" Joining date: "+e.getDateOfJoining()+" ]");
//    }
//}
//
//
//public class Assignment2Q1 {
//    public static void main(String[] args) throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Employee1> emp = new ArrayList<>();
//        SimpleDateFormat format=new SimpleDateFormat("dd MMM yyyy");
//        System.out.println("Input the number of employees :");
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.println("Enter the details for employee"+(i+1));
//            int id=sc.nextInt();
//            String name = sc.nextLine();
//            String department = sc.nextLine();
//            Date date = format.parse(sc.nextLine());
//            int age = sc.nextInt();
//            int salary = sc.nextInt();
//            emp.add(new Employee1(id, name, department, date, age, salary));
//        }
//    }
//}
