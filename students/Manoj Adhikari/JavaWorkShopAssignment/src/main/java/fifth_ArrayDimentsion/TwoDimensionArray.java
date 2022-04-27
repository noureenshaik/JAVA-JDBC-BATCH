package fifth_ArrayDimentsion;

public class TwoDimensionArray {

    public static void main(String[] args) {
        // Declares an one dimnesional array of integers
        int[][] anArray={{2,3},{5,5}};

        for(int i=0;i<2;i++){
            for(int j=0; j<2;j++){
                System.out.print(anArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
