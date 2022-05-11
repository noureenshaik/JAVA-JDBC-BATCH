package singleInheritance;

public class Student extends Employee {
    String name = "Adhikari";

    public static void main(String[] args) {
        Student sc = new Student();
        System.out.println("Student name is: " + sc.name);
        System.out.println("Student salary is: " + sc.salary);

    }

}
