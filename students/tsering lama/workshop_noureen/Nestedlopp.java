package Thursday;

import java.util.Scanner;

public class Nestedlopp {

	// nested loop = a loop inside of a loop
	
	
	public static void main(String[] args) {
		
Scanner scanner = new Scanner (System.in);
int rows;
int columns;
String symbol="";


System.out.println("ENter # of rows: ");
rows = scanner.nextInt();
System.out.println("ENter # of colums: ");
columns = scanner.nextInt();
System.out.println("ENter symbol to use: ");
symbol= scanner.next();

for(int i=1; i<=rows; i++) {
	System.out.println();
	
	for(int j=1; j<=columns; j++) {
		System.out.print(symbol);
	}
	
}




	}

}
