package stringbuffer;

public class StringBufferReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(1, 3, "Java");
		System.out.println(sb); // prints HJavalo

	}

}
