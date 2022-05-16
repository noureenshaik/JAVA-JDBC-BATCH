package exercisemay10;

//3)	Write a Java Program to swap two numbers using the third variable.
public class SwapUsingThird {
	public static void main(String args[]) {
		int a = 10, b=300;
		System.out.println("Before swap, a= " + a + " b = "+ b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap, a= " + a + " b = "+ b);
	}
	

}
