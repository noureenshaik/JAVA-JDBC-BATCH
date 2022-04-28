
public class CheckSpecificValues {
	public static void main(String[] args ) {
		int [] number= {12,23,12,3213,123,112,3213,1231,1231};
		System.out.println(Check(number,12));
		System.out.println(Check(number,102));
	}
	public static boolean Check(int[]arr,int num) {
		for(int i: arr) {
			if(i==num) {
				return true;
			}
		
	}return false;
		}

}
