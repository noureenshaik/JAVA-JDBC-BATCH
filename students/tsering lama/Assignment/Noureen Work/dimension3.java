package workshop;

import java.util.Scanner;

public class dimension3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	      System.out.println("Enter length of Array: ");
	      int arrLength = scan.nextInt();
	      int [] anArray= new int[arrLength]; 
	      System.out.println("Enter the elements of the Array");
	      for(int i = 0; i < arrLength; i++)
	      {
	          anArray[i] = scan.nextInt();
	      }
	      // Printing the One Dimensional Array
	      System.out.println("Displaying One dimensional array elements:");
	      for( int i=0; i < arrLength ; i++)
	      {
	          System.out.print(anArray[i] + " ");
	      }      
	   

	}

}
