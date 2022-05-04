package stringbuffer;

public class StringBufferDeleteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.delete(1, 3);
		System.out.println(sb); //Prints Hlo

	}

}
