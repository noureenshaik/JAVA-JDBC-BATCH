package AssignmentForLoop.Assignment3ForLoop;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of Natural number: Enter a number  : ");
        int num= sc.nextInt();
        int sum=0;

        for(int i=0; i<=num; ++i){
            sum+=i;

        }
        System.out.println("The sum of natural number 0 to  " + num +" is : " +sum);

    }
}
