package StringBufferAssignment;

public class CompareString {
	public static void main(String[] args) {
		 String str1 = "The Undertaker", str2 = "The Rock";
		    StringBuffer strbuf = new StringBuffer(str1);
		    
		    System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));
		    
		    System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
		    
		      }
}
