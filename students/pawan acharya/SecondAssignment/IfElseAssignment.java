import java.util.Scanner;

public class IfElseAssignment {

	// Demo for if statement
	static void ifDemo(int num) {
		if (num < 100) {
            System.out.println("The number is less than 100");
        }
	}
	
	// if else demo
	static void ifElseDemo(int num) {
		if (num <= 100) {
            System.out.println("The number is less or equal to 100");
        }
		else {
            System.out.println("The number is greater than 100");

		}
	}
	static void checkEvenOdd(int num) {
		if(num%2==0){
            System.out.println("The number " + num + " is even number");
        }else{
            System.out.println("The number " + num + "  is odd number");

        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number: ");
	     int num = sc.nextInt();
	     ifDemo(num);
	     System.out.println("Enter the next number: ");
	     int num1 =sc.nextInt();
	     ifElseDemo(num1);
	     System.out.println("Enter the next number: ");
	     int num2 =sc.nextInt();
	     checkEvenOdd(num2);
	}
	
	

}
