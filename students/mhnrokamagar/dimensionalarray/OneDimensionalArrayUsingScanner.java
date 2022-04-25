package dimensionalarray;
import java.util.Scanner; 

public class OneDimensionalArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int arrLength = scan.nextInt();
		int [] anArray= new int[arrLength];
		System.out.println("Enter the elements of the Array");
		for (int i = 0; i< arrLength; i++)
		{
			 anArray[i] = scan.nextInt();
			
		}
		// printing the one Dimensional Array
		System.out.println("Displaying One dimensional array elements: ");
		for(int i=0; i < arrLength; i++)
		{
			System.out.println(anArray[i] + "");
		}

	}

}
