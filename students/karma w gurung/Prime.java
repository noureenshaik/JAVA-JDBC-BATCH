import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int temp;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number");
        int num = in.nextInt();
        in.close();
        for (int i = 2; i<=num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + "number is prime");
            else
                System.out.println(num + "number is not a prime");
             
         
    }

}
