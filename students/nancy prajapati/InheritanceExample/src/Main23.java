
// Java program to illustrate the
// concept of Multiple inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

interface four {
	public void print_geek();
}

interface five {
	public void print_for();
}

interface six extends four, five {
	public void print_geek();
}

class child implements six {
	@Override
	public void print_geek() {
		System.out.println("Geeks");
	}

	public void print_for() {
		System.out.println("for");
	}
}

// Drived class

public class Main23 {
	public static void main(String[] args) {
		child c = new child();
		c.print_geek();
		c.print_for();
		c.print_geek();
	}

}
