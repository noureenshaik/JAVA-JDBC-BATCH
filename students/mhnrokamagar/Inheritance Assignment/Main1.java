package com.employee.inheri;

//Java program to illustrate the
//concept of Multilevel inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class one {
	public void print_greek()
	{
		System.out.println("Greeks");
		
	}
}
class two extends one {
	public void print_for() {
		System.out.println("for");
	}
}

class three extends two {
	public void print_greek()
	{
		System.out.println("Geeks");
	}
}
// Drived class

public class Main1 {
	public static void main(String[] args)
	{
		three g= new three ();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}

}