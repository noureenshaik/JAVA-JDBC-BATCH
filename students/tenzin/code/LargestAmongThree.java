
public class LargestAmongThree {

	public static void main(String [] args) {
		int num1=40;
		int num2=50;
		int num3=20;
		
		if (num1>num2&&num1>num3) {
			System.out.println("the largest number is " + num1);
		}else if(num2>num1&&num2>num3) {
			System.out.println("the largest number is "+num2);
		}else {
			System.out.println("the largest number is "+ num3);
		}
		
		
	}

}

	
