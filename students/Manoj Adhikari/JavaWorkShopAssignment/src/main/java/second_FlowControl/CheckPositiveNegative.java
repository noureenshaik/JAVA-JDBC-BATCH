package second_FlowControl;

import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("This is a positive number: "+ num);
        }else {
            System.out.println("This is a Negative number: "+ num);


        }
    }
}
