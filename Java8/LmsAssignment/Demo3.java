//public class Demo3 {
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee1 {

    private int id;
    private String name;
    private String address;
    private double salary;

    public Employee1() { }

    public Employee1(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee1)) return false;
        Employee1 employee1 = (Employee1) o;
        return this.getAddress().equals(((Employee1) o).getAddress());
    }

    @Override
    public int hashCode() {
        return this.getAddress().hashCode();
    }

    @Override
    public String toString() {
        return "\n Id= "+this.getId()+", Name= "+this.getName()+", Address= "+this.getAddress()+", Salary= "+this.getSalary();
    }
}
public class Demo3 {

    public static void main(String[] args) {
        List<Employee1> empList = new ArrayList<>();

        empList.add(new Employee1(1,"Shubham","VNS",48000));
        empList.add(new Employee1(2,"Aniket","Goa",450000));
        empList.add(new Employee1(3,"Rashi","VNS",150000));
        empList.add(new Employee1(4,"Puneet","Delhi",48000));
        empList.add(new Employee1(5,"Himesh","Goa",90000));

        Set<Employee1> unique = empList.stream().collect(Collectors.toSet());
        System.out.println(unique);

    }

}
