import java.util.Scanner;

public class InterviewQuestion4 {

	public static void main(String[] args) {
		int number;
		boolean check=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter one number");
		number=sc.nextInt()	;
		for(int i=2;i<=number;i++) {
			 if(number%i==0) {
				check=false;
				break;
			}
		}
		if(check) {
			System.out.println("The number is prime number");
		}else {
			System.out.println("The number is not prime number"+"\n\n");
		}
		
	}
}
