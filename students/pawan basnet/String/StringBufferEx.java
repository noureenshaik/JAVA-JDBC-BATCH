package Strings;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Java");
		System.out.println(sb);
		System.out.println(" ");

		
		sb.insert(1, "Java");
		System.out.println(sb);
		System.out.println(" ");

		
		sb.replace(1, 3, "Java");
		System.out.println(sb);
		System.out.println(" ");
		
		sb.delete(1, 3);
		System.out.println(sb);
		System.out.println(" ");
		
		sb.reverse();
		System.out.println("Hello");
		System.out.println(sb);
		
		StringBuffer  sbc = new StringBuffer();
		System.out.println(sbc.capacity());
		System.out.println(" ");
		sbc.append("Hello");
		System.out.println(sbc.capacity());
		sbc.append("Java is my fav language");
		System.out.println(sbc.capacity());
		
		
		
	}

}
