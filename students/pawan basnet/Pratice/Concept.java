package Pratice;

import java.util.Scanner;

import javafx.scene.SubScene;

public class Concept {
    Scanner sc = new Scanner(System.in);

    public void Palidrome() {
        System.out.println("Please enter string to check it its Palidrome:");
        String pali = sc.next();
        boolean check = true;
        int size = pali.length() - 1;

        for (int i = 0; i <= size; i++) {
            char first = pali.charAt(i);
            char last = pali.charAt(size - i);
            if (first != last) {
                check = false;
            }
        }
        System.out.println(check);
    }

    public void Fibonacci() {
        int add, fnum = 0;
        int snum = 1;
        for (int num = 1; num < 15; num++) {
            add = snum + fnum;
            snum = fnum;
            fnum = add;
            System.out.println(add);
        }
    }

    public void stringReverse() {
        System.out.println("Please enter string to reverse:");
        String rev = sc.next();
        char[] reversal = rev.toCharArray();

        for (int i = rev.length() - 1; i >= 0; i--) {
            System.out.print(reversal[i]);
        }
        System.out.println("Reverse of the given String is " + rev);
    }

    public void NumberSwap(){
        int x, y;
        System.out.println("Enter X and y Value");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before Swap"+ x+ " "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swap"+ x+ " "+y);
    }

    public void isPrime(){
        int temp, num;
        boolean isPrime = true;
        System.out.println("Enter number to check if its prime");
        num = sc.nextInt();
        for (int i =2;i<num/2;i++){
            temp = num%i;
            if(temp ==0){
                isPrime = false;
            }
        }
        if (isPrime)
        System.out.println(num +" is prime");
        else 
        System.out.println(num +" is not prime");
    }
    public static void main(String[] args) {
        Concept pc = new Concept();
        // pc.Palidrome();
        System.out.println("x");
        pc.stringReverse();

        System.out.println("x");
        pc.Fibonacci();
    }
}
