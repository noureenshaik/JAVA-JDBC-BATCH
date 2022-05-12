package AbstractionEx;

public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation";
		StringBuilder str2 = new StringBuilder();
		
		str2.append(str);
		str2 = str2.reverse(); // user string builder to reverse
		
		System.out.println(str2);

	}

}

// output:  noitamotuA
