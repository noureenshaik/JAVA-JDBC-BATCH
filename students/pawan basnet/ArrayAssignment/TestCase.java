import java.util.Scanner;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int totalTestCases, eachTestCaseValues;
	//	System.out.println("Enter Value for array row");
		totalTestCases = scan.nextInt();
		
		int[][] arrayMain = new int[totalTestCases][];
		
		for (int i = 0; i < arrayMain.length; i++) {
			eachTestCaseValues = scan.nextInt();
			arrayMain[i] = new int[eachTestCaseValues];
			for(int j = 0; j<arrayMain[i].length;j++) {
				arrayMain[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < arrayMain.length; i++) {
			int nEvenNumbers = 0, nOddNumbers = 0;
			System.out.println("TestCase " + i + " with " + arrayMain[i].length + " values:");
			for (int j = 0; j < arrayMain[i].length; j++) {
				System.out.print(arrayMain[i][j] + " ");
				if (arrayMain[i][j] % 2 == 0) {
					nEvenNumbers++;}
				else {
					nOddNumbers++;}
				}
					System.out.println();
					System.out.println("Total Even numbers: " + nEvenNumbers + ", Total Odd numbers: " + nOddNumbers);
		}	
	
	}

}
