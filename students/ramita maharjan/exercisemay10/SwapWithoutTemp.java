package exercisemay10;

public class SwapWithoutTemp {
	public static void main(String args[]) {
		int a = 10, b=300;
		System.out.println("Before swap, a= " + a + " b = "+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap, a= " + a + " b = "+ b);
	}
	
}
