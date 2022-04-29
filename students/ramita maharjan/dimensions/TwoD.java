package dimensions;

public class TwoD {
	public static void main(String[] args)
    {
  
        int[][] arr = { { 1, 2 ,34, 7 }, { 3, 4, 5, 90 } };
  
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
  
            System.out.println();
        }
    }

}
