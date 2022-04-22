package AssignmentForLoop.Assignment3ForLoop;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want to run : ");
        int num= sc.nextInt();

        for(int i=0; i<num; ++i){
            System.out.println(" Java is a fun");
        }

    }
}
