package Interview;

public class FinalReverseWithoutUsingInbuiltFunction {

	public static void main(String[] args) {
		String str = "Manoj Adhikari";
		// converted tocharacter array and printed in reveerse order
		char chars[] = str.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
	}
}
