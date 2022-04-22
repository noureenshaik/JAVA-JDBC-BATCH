import java.util.Scanner;

public class ExerciseOne {
	
	// print 'Hello' on screen and then print my name on a separate line. 
	static void introduce() {
		System.out.println("Hello\nPawan Acharya!");
	 }
	
	//sum two numbers dynamically
	static void sum() {
		try (Scanner input = new Scanner (System.in)) {
			System.out.print("Input the first number: ");
			int num1 = input.nextInt();
			System.out.print("Input the second number: ");
			int num2 = input.nextInt();
			int sum = num1 + num2;
			System.out.println();
			System.out.println("The sum is: "+sum);
		}

	}
	
	// welcome someone dynamically 
	static void welcome() {
		try (Scanner sc = new Scanner(System.in)){
		    System.out.print("Input your first name: ");
		    String fname = sc.next();
		    System.out.print("Input your last name: ");
		    String lname = sc.next();
		    System.out.println();
		    System.out.println("Hello \n"+fname+" "+lname);

		}
	}
	
	// method to divide two numbers entered dynamically
	static void division() {
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Input the first number: ");
		    int a = sc.nextInt();
		    System.out.print("Input the second number: ");
		    int b = sc.nextInt();
		    int d = (a/b);
		    System.out.println();
		    System.out.println("The division of a and b is:" +d);

		}
	}
	
	// Question four 
	static void question_four() {
		System.out.println(-5+8*6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Call any method you want to check ---- here--
		//introduce();
		//sum();
		//welcome();
		//division();
		question_four();
		

	}

}
