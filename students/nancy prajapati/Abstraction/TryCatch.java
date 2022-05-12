package interview;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 50;
		int j = 0;
		int data;
		try {
			data = i / j;  //50/0=exception
			// may throw exception
//holding the exception
		} catch (Exception e) {

			// resolving the exception in catch block
			System.out.println(i / (j + 2)); // 50/0+2=25
		}

	}

}
