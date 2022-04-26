package fifth_ArrayDimentsion;

import java.util.Scanner;

public class ScannerClassLoopArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Total test cases = total
        // Number of test cases
        // each test case values
        // values in each test cases as
        // an array values
        int totalTestCases, eachTestCaseValues;

        // takes total nunber of
        // test cases as integer number
        totalTestCases = sc.nextInt();

        // an array is formed as row
        // values for total test cases
        int[][] arrayMain= new int[totalTestCases][];

        // for loop to take input of
        // values in each test cases


        for (int i=0 ; i<arrayMain.length;i++){
            eachTestCaseValues=sc.nextInt();
            arrayMain[i]= new int [eachTestCaseValues];
            for(int j=0;j<arrayMain[i].length;j++){
                arrayMain[i][j]=sc.nextInt();
            }
        }// all input entry is done
        // start executing output
        // according to condition provided
        for(int i=0; i<arrayMain.length; i++){
            // initialize total number of
            //even and odd numbers to zero
            int nEvenNumber = 0, nOddNumbers=0;
            // print test case number with
            // total number of its arguments

            System.out.print( "Test case " +i + "with "+ arrayMain[i].length + " values ");

            for (int j=0; j<arrayMain[i].length;j++) {
                System.out.println(arrayMain[i][j] + " ");

                // even and odd counter updated as
                // eligible number is found
                if (arrayMain[i][j] % 2 == 0) {
                    nEvenNumber++;
                } else
                {
                    nOddNumbers++;
                }
            }
            System.out.println();
            //print total number of
            // enven and odd
            System.out.println(" Total enven number : "+ nEvenNumber + ", Total odd numbers: " + nOddNumbers);


        }



    }
}
