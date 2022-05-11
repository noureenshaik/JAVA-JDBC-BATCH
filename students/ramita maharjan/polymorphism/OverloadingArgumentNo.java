package polymorphism;

public class OverloadingArgumentNo {
	public static void main(String[] args) {
	    Display d1 = new Display();

	    // call method without any argument
	    d1.display();
	    System.out.println("\n");

	    // call method with a single argument
	    d1.display('#');
	  }

}
