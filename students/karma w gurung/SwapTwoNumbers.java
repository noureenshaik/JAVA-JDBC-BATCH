import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x, y, temp;
		System.out.println("Enter a value of x");
		x = in.nextInt();
		System.out.println("Enter a value of y");
		y = in.nextInt();
		
		
		
		System.out.println("Before Swapping = " + x + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping = " + x + y);

	}

}
