
public class Fibonacci {

	public static void main(String [] args) {
		int[] fibonacci=new int[8];
		fibonacci[0]=0;
		fibonacci[1]=1;
		System.out.println("The fibonacci series till 8 are \n");
		for(int i=2;i<8;i++) {
			fibonacci[i]=fibonacci[i-2]+fibonacci[i-1];
			System.out.println(fibonacci[i]+"  ");
		}
	}
}
