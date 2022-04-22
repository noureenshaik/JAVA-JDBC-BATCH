package second_FlowControl;

import java.util.Scanner;

public class IfElseStatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num < 50) {
            System.out.println("The number is less than 50");
        } else
            System.out.println("The number is greater or equal 50");

    }
}
