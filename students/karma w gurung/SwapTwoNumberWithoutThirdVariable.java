import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int x, y;
		System.out.println("Enter a value of x");
		x = in.nextInt();
		System.out.println("Enter a value of y");
		y = in.nextInt();
		
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	  
	      x = x + y;
	      y = x - y;
	      x = x - y;
	  
	      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
	   }
	}


