import java.util.Scanner;

public class SumOfPositiveNumber {
	
	public static void main(String [] args) {
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one number");
		int number=sc.nextInt();
		while(number>=0) {
		System.out.println("enter one number");
		number=sc.nextInt();
		sum+=number;
	}
	System.out.println("the sum is "+sum);	
	
	}

}
