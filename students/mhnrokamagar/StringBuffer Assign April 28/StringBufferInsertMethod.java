package stringbuffer;

public class StringBufferInsertMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.insert(1, "Java"); //now original string is changed
		System.out.println(sb); //prints HJavaello

	}

}
