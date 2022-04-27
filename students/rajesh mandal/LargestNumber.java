package ifelsestatement;

public class LargestNumber {
	   public static void main(String args[]){
		   
	   
		   int x,y,z;
		   x = 100;
		   y = 300;
		   z= 50;
		   
		   int largest;
		   if(x>y && x>z) {
			   largest = x;
			   System.out.println(x);
		   }else if(y>x && y>z){
			   largest = y;
			   System.out.println(y);
		   }else {
			   largest = z;
			   System.out.println(z);
		   }
		   
	   }
}