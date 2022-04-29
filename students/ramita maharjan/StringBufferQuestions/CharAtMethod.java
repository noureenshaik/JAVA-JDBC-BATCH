package StringBufferQuestions;

public class CharAtMethod {
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer();   
		sb.append("java is my favourite language");  
		System.out.println(sb.toString());
		for(int i = 0; i <sb.length(); i++) {
			System.out.println("Character at index "+ i + " " + sb.charAt(i));
		}
	}  

}
