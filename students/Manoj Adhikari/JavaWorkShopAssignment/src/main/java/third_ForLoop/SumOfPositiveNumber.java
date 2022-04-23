package AssignmentForLoop.Assignment3ForLoop;

import java.util.Scanner;

public class SumOfPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int num = sc.nextInt();
        int sum = 0;

        while (num >= 0) {
            sum += num;
            System.out.println(" Enter a number  : ");
            num = sc.nextInt();
        }
        System.out.println("The sum of Positive number is : " + sum);
        sc.close();

    }


}
