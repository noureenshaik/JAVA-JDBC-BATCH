
import java.io.*;
import java.lang.*;
import java.util.*;

interface one {
	public void print_geek();
}

interface two {
	public void print_for();
}

interface three extends one, two {
	public void print_geek();
}

class child implements three {
	@Override
	public void print_geek() {
		System.out.println("Geeks");
	}

	public void print_for() {
		System.out.println("for");
	}
}
