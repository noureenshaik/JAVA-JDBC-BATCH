package exercisemay10;

//Write a Java Program to find whether a number is prime or not
public class PrimeCheck {
	public static void main(String args[]) {
		int a = 445;
		boolean prime = true;
		for(int i = 2; i < a/2; i++) {
			if(a % i == 0) {
				prime = false;
				break;
			}
				
		}
		if(prime)
			System.out.println(a + " is prime");
		else
			System.out.println(a + " is not prime");
	}
}
