package string;

public class JoinTwoJavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create first string
		String first="Java";
		System.out.println("First String:" + first);
		
		//create second string
		String second="Programming";
		System.out.println("Second String:" + second);
		
		//join two strings
		String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);


	}

}
