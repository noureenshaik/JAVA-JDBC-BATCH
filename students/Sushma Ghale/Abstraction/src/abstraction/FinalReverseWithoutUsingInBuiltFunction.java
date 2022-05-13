package abstraction;

public class FinalReverseWithoutUsingInBuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Sushma Ghale";
char chars[]= str. toCharArray();
//converted to character array and printed in reverse order
for (int i= chars.length-1; i>=0; i--) {
	System.out.print(chars[i]);
}
	}

}
