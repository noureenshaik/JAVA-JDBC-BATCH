
public class largest_number {

	public static void main(String[] args) {
		int x=20;
		int y=30;
		int z=40;
		int largest;
		if(x>y && x>z) {
			largest =x;
		}else if (y>x && y>z) {
			largest =y;
		}else {
			largest =z;
		}
		System.out.println(largest);
		
		
		

	}

}
