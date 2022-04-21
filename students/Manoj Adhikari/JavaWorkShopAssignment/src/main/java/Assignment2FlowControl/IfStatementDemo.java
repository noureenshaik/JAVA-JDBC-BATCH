package Assignment2FlowControl;

import java.util.Scanner;

public class IfStatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num <= 100) {
            System.out.println("The number is less than 100");
        }

    }
}
