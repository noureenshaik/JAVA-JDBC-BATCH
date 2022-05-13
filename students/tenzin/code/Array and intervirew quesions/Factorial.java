
public class Factorial {

	static int factorial(int f) {
		if(f==1) {
			return 1;
		}else {
			return factorial(f-1)*f;
		}
		
	}
	public static void main(String [] args) {
		int k=factorial(5);
		System.out.println(factorial(4)+"   "+(k));
	}
}
