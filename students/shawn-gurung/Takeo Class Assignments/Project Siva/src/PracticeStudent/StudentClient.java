package PracticeStudent;
import java.util.Scanner;

import PracticeStudent.StudentDetails;

public class StudentClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("*************************************************");

		System.out.println("           1)Student                         ");
		System.out.println("           2)Exit                          ");

		System.out.println("*************************************************");
		System.out.println("Enter the Choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			StudentDetails details=new StudentDetails();
			details.stuMenu();
			break;
		case 2:
			System.out.println("Thx for Using App!");
		System.exit(0);
		default:
			System.out.println("Choose  1 to 2 Between");
		
		}//choice
	}

}
