package LmsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Employee{
    private int id;
    private String name;
    private String address;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String address, int salary) {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "\n Id= "+this.getId()+", Name= "+this.getName()+", Address= "+this.getAddress()+", Salary= "+this.getSalary();
    }

}

public class Demo1 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(1,"Shubham","VNS",48000));
        list.add(new Employee(2,"Aniket","Goa",450000));
        list.add(new Employee(3,"Rashi","Mysore",150000));
        list.add(new Employee(4,"Puneet","Delhi",48000));
        list.add(new Employee(5,"Himesh","Pune",90000));

        Collections.sort(list, (Employee o1,Employee o2)->
                        (o1.getSalary()!=o2.getSalary()?(o1.getSalary()-o2.getSalary()):(o1.getName().compareTo(o2.getName()))));
        System.out.println("Sorted by Salary & then Name!");
        System.out.println(list);

    }
}
