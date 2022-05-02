
public class GFG1 {

	public static void main(String[] args) {
	
		StringBuilder sb=new StringBuilder("WelcomeToNepal");
		System.out.println("The topic is "+ sb);
		for(int i=0;i<sb.length();i++) {
			char ch=sb.charAt(i);
			
			System.out.println("the char at index "+i+" is "+ch);
		}
	}
}
