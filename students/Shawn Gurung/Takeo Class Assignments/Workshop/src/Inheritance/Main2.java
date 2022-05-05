package Inheritance;

// Java program to illustrate the
// concept of Multiple inheritance
import java.io.*;
import java.lang.*;
import java.util.*;
 
interface uno {
    public void print_geek();
}
 
interface dos {
    public void print_for();
}
 
interface three extends uno, dos {
    public void print_geek();
}
class child implements three {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }
 
    public void print_for() { System.out.println("for"); }
}
 
// Drived class
public class Main2 {
    public static void main(String[] args)
    {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
