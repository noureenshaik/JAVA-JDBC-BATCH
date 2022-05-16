package exercisemay10;

//1)	Write a Java Program to reverse a string without using String inbuilt function.
public class ReverseString {
	public static void main(String args[]) {
		System.out.println("Reverse of string tram: " + reverse("tram"));
	}
	
	public static String reverse(String s) {
		char[] str = s.toCharArray();
		int len = s.length();
		for(int i = 0; i < len/2; i++) {
			char temp = str[i];
			str[i] = str[len -1 -i];
			str[len - 1 - i] = temp;
		}
		return String.valueOf(str);
	}
}
