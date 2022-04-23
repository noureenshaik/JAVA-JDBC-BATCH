
public class LargestNumber {
   public static void main(String args[]){
	   int x = 13,y = 30,z=40;
	   int largest;
	   if(x>y && x>z) {
		   largest = x;
	   }else if(y>x && y>z){
		   largest = y;
	   }else {
		   largest = z;
	   }
	   System.out.println(largest);
   }
}
