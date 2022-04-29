package ifelsestatement;

public class NestedIfEx2 {

	   public static void main(String args[]){
	        int num=70;
		if( num < 100 ){ 
	           System.out.println("number is less than 100"); 
	           if(num > 50){
		      System.out.println("number is greater than 50");
		   }
		}
	   }
	}
