package org.example;

public class Employee {
    public static void main(String args[])
    {
//        Employee emp= new Employee();
        System.out.println(Person.salary());
    }
    public Employee(){
        System.out.println("This is employee");
    }
    public static  int value=Person.salary();
}
