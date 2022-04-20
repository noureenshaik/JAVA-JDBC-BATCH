package Assignment2FlowControl;

import java.util.Scanner;

public class IfElseIfStatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num >= 1 && num < 100) {
            System.out.println("It is a two digit number");
        } else if (num >= 100 && num < 1000) {
            System.out.println("It is a three digit number");
        } else if (num >= 1000 && num < 10000) {
            System.out.println("It is a four digit number");
        } else if (num >= 10000 && num < 100000) {
            System.out.println("It is a five digit number");
        } else {
            System.out.println("The number is not between 1 & 99999");


        }


    }
}

