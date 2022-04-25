import java.util.Scanner;
public class TwoDimentionalArray {
	public static void main (String [] args) {
		int[][] array =new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four number !");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
			array[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
