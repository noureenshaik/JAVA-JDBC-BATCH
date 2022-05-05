package com.example.demoProject.Polymorphism.Encapsulation;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Saroj");
        System.out.println(student.getName());

    }

}
