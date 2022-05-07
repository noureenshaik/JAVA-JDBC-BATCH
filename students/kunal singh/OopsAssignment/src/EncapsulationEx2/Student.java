package EncapsulationEx2;
// Read only
//A Java class which has only getter methods.
public class Student {
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

