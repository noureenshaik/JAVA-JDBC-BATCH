package fifth_ArrayDimentsion;

import java.util.Scanner;

public class OneDimensionArrayScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of Array: ");

        int arrLenghth = sc.nextInt();
        int[] anArray = new int[arrLenghth];
        System.out.println("Enter the elements of the array: ");

        for (int i=0 ; i<arrLenghth;i++){
            anArray[i]=sc.nextInt();
        }
        System.out.println("Printing one dimension array : ");
        for(int i=0; i<arrLenghth; i++){
            System.out.print( anArray[i] + " ");

        }



    }
}
