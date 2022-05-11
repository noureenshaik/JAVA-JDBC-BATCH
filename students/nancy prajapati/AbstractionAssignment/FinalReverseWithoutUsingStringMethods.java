package interview;

//1)	Write a Java Program to reverse a string without using String inbuilt function.
public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Automation";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse(); /// used String builder to reverse
		System.out.println(str2);

	}

}
