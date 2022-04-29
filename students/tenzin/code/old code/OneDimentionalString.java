import java.util.Scanner;
public class OneDimentionalString {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String[] names=new String[2];
		System.out.println("Enter three names");
			for(int i=0;i<3;i++) {
			 names[i]=sc.nextLine();
			}
			System.out.println("The three names are ");
			for(int j=0;j<=names.length;j++) {
				System.out.println(names[j]+" ");
			}
	}

}
