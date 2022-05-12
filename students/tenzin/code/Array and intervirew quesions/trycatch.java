	
public class trycatch {

	public static void main(String [] args) {
		int j=10;
		int k=2;
		int data;
		
		try {
			data=j/0;
			System.out.println(k);
		}
		catch(Exception e) {
			System.out.println(j+k);
		}
	}
}
