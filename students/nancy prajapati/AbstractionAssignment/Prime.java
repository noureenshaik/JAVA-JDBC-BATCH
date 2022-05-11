package interview;

//7) Write a Java Program to find whether a number is prime or not.
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp, num;
		boolean isPrime = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = sc.nextInt();
		sc.close();
		for (int i = 2; i >= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime) {
			System.out.println(num + "number is prime");}
		else {
			System.out.println(num + "number is not prime");}

	}

}
