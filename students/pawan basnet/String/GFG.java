package Strings;

public class GFG {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("Geek");
		char ch = str.charAt(1);

		System.out.println("StringBuilder Object contains= " + str);
		System.out.println("Character  at Position 1  in StringBuilder = " + ch);

		StringBuilder str2 = new StringBuilder("WelcomeGeeks");
		System.out.println("String  is " + str2.toString());

		for (int i = 0; i < str2.length(); i++) {
			char ch2 = str2.charAt(i);
			System.out.println("Chat at position " + i + " is " + ch2);
		}
	}
}
