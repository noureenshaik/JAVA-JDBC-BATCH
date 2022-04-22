package AssignmentForLoop.Assignment3ForLoop;

import java.util.Scanner;

public class BreakStatement2 {
    public static void main(String[] args) {

        Double num,sum=0.0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number : ");
             num= sc.nextDouble();
             if(num<0.0){
                 break;
             }
             sum+=num;

        }
           System.out.println("Sum="+sum);


       }



    }

