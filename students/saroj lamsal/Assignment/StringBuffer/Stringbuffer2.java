package workshop;

public class Stringbuffer2 {

	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Hello ");
	sb.insert(1, "java");//now original string is changed
	System.out.println(sb);//prints Hjavaello 

	}

}
