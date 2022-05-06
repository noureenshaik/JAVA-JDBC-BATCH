package com.javatpoint;

//Read only
//A Java class which has only getter methods.
public class Student1 {
 //private data member
 private String college = "AKG";

 //getter method for college
 public String getCollege() {
     return college;
 }
 //getter method for college
 public void setCollege(String college){
     this.college=college;
 }

}
