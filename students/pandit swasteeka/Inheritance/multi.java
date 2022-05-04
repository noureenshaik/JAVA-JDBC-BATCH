package Inheritance;

public class multi {
	 public void printGeeek() {
	        System.out.println("Geeks");
	    }
	}

	class two extends multi {
	    public void printFor() {
	        System.out.println("For");
	    }
	}

	class three extends two {
	    public void printGeeek() {
	        System.out.println("Geeks1");
	    }

}
