
public class StringReverse {

	public static void main(String [] args) {
		String name="TENZIN";
		
		StringBuffer sb=new StringBuffer(name);
		String reverse=sb.reverse().toString();
		System.out.println(reverse);
	}
}
