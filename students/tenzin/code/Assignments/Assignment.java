
public class Assignment {

	public static void main(String [] args) {
		String str="Tenzin";
		String str1="Tashi";
		StringBuffer sb=new StringBuffer(str);

		System.out.println("comparing Tenzin and "+sb+" = "+str.contentEquals(sb));
		System.out.println("comparing Tenzin and "+sb+" = "+str1.contentEquals(sb));
	}
}
