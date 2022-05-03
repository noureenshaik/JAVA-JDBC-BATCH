package Strings;

class Javatpoint {
	private int i;

	Javatpoint() {
	}

	Javatpoint(int i) {
		this.i=i;
	}

	public int getValue(int i) {
		return this.i = i;
	}

	public int setValue(int i) {
		return this.i = i;
	}

	public String toString() {
		return Integer.toString(i);
	}
}

public class TestJavatpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javatpoint j = new Javatpoint(55);
		System.out.println(j);
	}
}
