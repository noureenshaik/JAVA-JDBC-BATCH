package Interview;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		int temp, num;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
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
			System.out.println(num + "  is a prime number");
		} else {
			System.out.println(num + "  is not a prime number");

		}

	}

}
