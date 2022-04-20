package assignment1Funamental;

import java.util.Scanner;

public class DivisionScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1= sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2= sc.nextInt();

        int div = num1/num2;
        System.out.println();

        System.out.println("Division of  "+num1 + " and " + num2 +" is  "+div);

    }
}
