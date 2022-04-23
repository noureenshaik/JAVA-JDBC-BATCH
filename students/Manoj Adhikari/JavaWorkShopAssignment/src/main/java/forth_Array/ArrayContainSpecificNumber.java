package forth_Array;

import java.util.Scanner;

public class ArrayContainSpecificNumber {

    public static void main(String[] args) {

    int numbers[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your luck number: ");
        int luckyNum = sc.nextInt();
        boolean found = false;


    for(int num: numbers){
        if(num==luckyNum){
            found=true;
            break;
        }
    }
    if(found)
    System.out.println("Your lucky number is found, which is: "+ luckyNum);
    else
        System.out.println("Your lucky number is not found, which is: "+ luckyNum+" Try again" );


    }
}
