package fundamentals;

public class Star_no_5 {

	public static void main(String[] args) {
		int n=5;
	for (int i=n;i>=1;i--)
	{
		for (int j=1;j<i; j++)
		{
			System.out.print(" " );
		}
		for (int j=0;j<=n-i; j++)
			System.out.println("*");
	
	}
	System.out.println();

	}

}
